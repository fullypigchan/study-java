package com.app.repository;
////1. 상품 등록

//Long save(ProductVO product)
////2. 전체 상품 조회
//List<ProductVO> findAll()
////3. ID로 조회
//Optional<ProductVO> findById(Long id)
////4. 카테고리별 조회
//List<ProductVO> findByCategory(ProductCategory category)
////5. 재고 부족 상품 조회 (재고 N개 이하)
//List<ProductVO> findLowStockProducts(int threshold)
////6. 가격 범위로 조회
//List<ProductVO> findByPriceBetween(int minPrice, int maxPrice)
////7. 상품명 검색 (LIKE)
//List<ProductVO> findByNameContaining(String keyword)
////8. 재고 증가/감소
//int updateStock(Long productId, int quantity) // 음수면 감소
////9. 상품 삭제
//int delete(Long id)

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.app.config.DBConnecter;
import com.app.domain.ProductVO;
import com.app.enumeration.ProductCategory;

public class ProductDAO {
   private Connection connection;
   private PreparedStatement preparedStatement;
   private ResultSet resultSet;

//1. 상품 등록
   public Long save(ProductVO product) {
      StringBuilder stringBuilder = new StringBuilder();
      String query = null;
      Long productId;

      stringBuilder.append("insert into tbl_product ");
      stringBuilder.append("(product_name, price, stock, category) ");
      stringBuilder.append("values(?,?,?,?) ");

      query = stringBuilder.toString();

      connection = DBConnecter.getConnection();

      try {
         preparedStatement = connection.prepareStatement(query, java.sql.Statement.RETURN_GENERATED_KEYS);
         preparedStatement.setString(1, product.getProductName());
         preparedStatement.setInt(2, product.getPrice());
         preparedStatement.setInt(3, product.getStock());
         preparedStatement.setString(4, product.getCategory().getValue());
         preparedStatement.executeUpdate();

         resultSet = preparedStatement.getGeneratedKeys();

         if (resultSet.next()) {
            return resultSet.getLong(1);

         }
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("save(ProductVO) SQL문 오류");
      } finally {
         try {
            if (resultSet != null) {
               resultSet.close();
            }
            if (preparedStatement != null) {
               preparedStatement.close();
            }
            if (connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
         }

      }
      return null;
   }

//2. 전체 상품 조회
   public List<ProductVO> findAll() {
      StringBuilder stringBuilder = new StringBuilder();
      String query = null;
      ProductVO product = null;
      ArrayList<ProductVO> products = new ArrayList<ProductVO>();

      stringBuilder.append("select id, product_name, price, stock, category, created, updated ");
      stringBuilder.append("from tbl_product ");
      query = stringBuilder.toString();

      connection = DBConnecter.getConnection();

      try {
         preparedStatement = connection.prepareStatement(query);
         resultSet = preparedStatement.executeQuery();

         while (resultSet.next()) {
            product = new ProductVO();
            product.setId(resultSet.getLong("id"));
            product.setProductName(resultSet.getString("product_name"));
            product.setPrice(resultSet.getInt("price"));
            product.setStock(resultSet.getInt("stock"));
            product.setCategory(resultSet.getString("category"));
            product.setCreated(resultSet.getString("created"));
            product.setUpdated(resultSet.getString("updated"));

            products.add(product);
         }
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("findAll() SQL문 오류");
      } finally {
         try {
            if (resultSet != null) {
               resultSet.close();
            }
            if (preparedStatement != null) {
               preparedStatement.close();
            }
            if (connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
         }

      }
      return products;

   }

//3. ID로 조회
   public Optional<ProductVO> findById(Long id) {
      StringBuilder stringBuilder = new StringBuilder();
      String query = null;
      ProductVO product = null;

      stringBuilder.append("select id, product_name, price, stock, category, created, updated ");
      stringBuilder.append("from tbl_product ");
      stringBuilder.append("where id=? ");

      query = stringBuilder.toString();

      connection = DBConnecter.getConnection();

      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, id);
         resultSet = preparedStatement.executeQuery();

         if (resultSet.next()) {
            product = new ProductVO();
            product.setId(resultSet.getLong("id"));
            product.setProductName(resultSet.getString("product_name"));
            product.setPrice(resultSet.getInt("price"));
            product.setStock(resultSet.getInt("stock"));
            product.setCategory(resultSet.getString("category"));
            product.setCreated(resultSet.getString("created"));
            product.setCreated(resultSet.getString("updated"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("findById(Long) SQL문 오류");
      } finally {
         try {
            if (resultSet != null) {
               resultSet.close();
            }
            if (preparedStatement != null) {
               preparedStatement.close();
            }
            if (connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
         }

      }
      return Optional.ofNullable(product);

   }

//4. 카테고리별 조회
   public List<ProductVO> findByCategory(ProductCategory category) {
      StringBuilder stringBuilder = new StringBuilder();
      String query = null;
      ProductVO product = null;
      ArrayList<ProductVO> products = new ArrayList<ProductVO>();

      stringBuilder.append("select id, product_name, price, stock, category, created, updated ");
      stringBuilder.append("from tbl_product ");
      stringBuilder.append("where category = ? ");
      query = stringBuilder.toString();

      connection = DBConnecter.getConnection();

      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, category.getValue());
         resultSet = preparedStatement.executeQuery();

         while (resultSet.next()) {
            product = new ProductVO();
            product.setId(resultSet.getLong("id"));
            product.setProductName(resultSet.getString("product_name"));
            product.setPrice(resultSet.getInt("price"));
            product.setStock(resultSet.getInt("stock"));
            product.setCategory(resultSet.getString("category"));
            product.setCreated(resultSet.getString("created"));
            product.setUpdated(resultSet.getString("updated"));

            products.add(product);
         }
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("findByCategory(ProductCategory) SQL문 오류");
      } finally {
         try {
            if (resultSet != null) {
               resultSet.close();
            }
            if (preparedStatement != null) {
               preparedStatement.close();
            }
            if (connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
         }

      }
      return products;

   }

//5. 재고 부족 상품 조회 (재고 N개 이하)
   public List<ProductVO> findLowStockProducts(int threshold) {
      StringBuilder stringBuilder = new StringBuilder();
      String query = null;
      ProductVO product = null;
      ArrayList<ProductVO> products = new ArrayList<ProductVO>();

      stringBuilder.append("select id, product_name, price, stock, category, created, updated ");
      stringBuilder.append("from tbl_product ");
      stringBuilder.append("where stock < ? ");
      query = stringBuilder.toString();

      connection = DBConnecter.getConnection();

      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setInt(1, threshold);
         resultSet = preparedStatement.executeQuery();

         while (resultSet.next()) {
            product = new ProductVO();
            product.setId(resultSet.getLong("id"));
            product.setProductName(resultSet.getString("product_name"));
            product.setPrice(resultSet.getInt("price"));
            product.setStock(resultSet.getInt("stock"));
            product.setCategory(resultSet.getString("category"));
            product.setCreated(resultSet.getString("created"));
            product.setUpdated(resultSet.getString("updated"));

            products.add(product);
         }
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("findLowStockProducts(int) SQL문 오류");
      } finally {
         try {
            if (resultSet != null) {
               resultSet.close();
            }
            if (preparedStatement != null) {
               preparedStatement.close();
            }
            if (connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
         }

      }
      return products;
   }

//6. 가격 범위로 조회
   public List<ProductVO> findByPriceBetween(int minPrice, int maxPrice) {
      StringBuilder stringBuilder = new StringBuilder();
      String query = null;
      ProductVO product = null;
      ArrayList<ProductVO> products = new ArrayList<ProductVO>();

      stringBuilder.append("select id, product_name, price, stock, category, created, updated ");
      stringBuilder.append("from tbl_product ");
      stringBuilder.append("where price between ? and ? ");
      query = stringBuilder.toString();

      connection = DBConnecter.getConnection();

      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setInt(1, minPrice);
         preparedStatement.setInt(2, maxPrice);
         resultSet = preparedStatement.executeQuery();

         while (resultSet.next()) {
            product = new ProductVO();
            product.setId(resultSet.getLong("id"));
            product.setProductName(resultSet.getString("product_name"));
            product.setPrice(resultSet.getInt("price"));
            product.setStock(resultSet.getInt("stock"));
            product.setCategory(resultSet.getString("category"));
            product.setCreated(resultSet.getString("created"));
            product.setUpdated(resultSet.getString("updated"));

            products.add(product);
         }
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("findByPriceBetween(int) SQL문 오류");
      } finally {
         try {
            if (resultSet != null) {
               resultSet.close();
            }
            if (preparedStatement != null) {
               preparedStatement.close();
            }
            if (connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
         }

      }
      return products;
   }

//7. 상품명 검색 (LIKE)
   public List<ProductVO> findByNameContaining(String keyword) {
      StringBuilder stringBuilder = new StringBuilder();
      String query = null;
      ProductVO product = null;
      ArrayList<ProductVO> products = new ArrayList<ProductVO>();

      stringBuilder.append("select id, product_name, price, stock, category, created, updated ");
      stringBuilder.append("from tbl_product ");
      stringBuilder.append("where product_name like concat('%', ?, '%') ");
      query = stringBuilder.toString();

      connection = DBConnecter.getConnection();

      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, keyword);
         resultSet = preparedStatement.executeQuery();

         while (resultSet.next()) {
            product = new ProductVO();
            product.setId(resultSet.getLong("id"));
            product.setProductName(resultSet.getString("product_name"));
            product.setPrice(resultSet.getInt("price"));
            product.setStock(resultSet.getInt("stock"));
            product.setCategory(resultSet.getString("category"));
            product.setCreated(resultSet.getString("created"));
            product.setUpdated(resultSet.getString("updated"));

            products.add(product);
         }
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("findByNameContaining(String) SQL문 오류");
      } finally {
         try {
            if (resultSet != null) {
               resultSet.close();
            }
            if (preparedStatement != null) {
               preparedStatement.close();
            }
            if (connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
         }

      }
      return products;
   }

//8. 재고 증가/감소(음수면 감소)
   public int updateStock(Long productId, int quantity) {
      StringBuilder stringBuilder = new StringBuilder();
      String query = null;

      stringBuilder.append("update tbl_product ");
      stringBuilder.append("set stock = stock + ? ");
      stringBuilder.append("where id = ?");

      query = stringBuilder.toString();

      connection = DBConnecter.getConnection();

      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setInt(1, quantity);
         preparedStatement.setLong(2, productId);

         int result = preparedStatement.executeUpdate();
         return result;
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("updateStock(Long) SQL문 오류");
      } finally { 
         try {
            if (preparedStatement != null) {
               preparedStatement.close();
            }
            if (connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
         }
      }
      return 0;
   }

//9. 상품 삭제
   public int delete(Long id) {
      StringBuilder stringBuilder = new StringBuilder();
      String query = null;

      stringBuilder.append("delete from tbl_product ");
      stringBuilder.append("where id = ?");

      query = stringBuilder.toString();

      connection = DBConnecter.getConnection();

      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, id);
         int result = preparedStatement.executeUpdate();
         return result;

      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("delete(Long) SQL 오류");
      } finally {
         try {
            if (preparedStatement != null) {
               preparedStatement.close();
            }
            if (connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
         }
      }
      return 0;

   }

}
