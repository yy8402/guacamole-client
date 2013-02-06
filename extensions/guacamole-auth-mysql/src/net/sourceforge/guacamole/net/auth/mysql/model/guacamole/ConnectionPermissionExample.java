package net.sourceforge.guacamole.net.auth.mysql.model.guacamole;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPermissionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    public ConnectionPermissionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Integer value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Integer> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andConnection_idIsNull() {
            addCriterion("connection_id is null");
            return (Criteria) this;
        }

        public Criteria andConnection_idIsNotNull() {
            addCriterion("connection_id is not null");
            return (Criteria) this;
        }

        public Criteria andConnection_idEqualTo(Integer value) {
            addCriterion("connection_id =", value, "connection_id");
            return (Criteria) this;
        }

        public Criteria andConnection_idNotEqualTo(Integer value) {
            addCriterion("connection_id <>", value, "connection_id");
            return (Criteria) this;
        }

        public Criteria andConnection_idGreaterThan(Integer value) {
            addCriterion("connection_id >", value, "connection_id");
            return (Criteria) this;
        }

        public Criteria andConnection_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("connection_id >=", value, "connection_id");
            return (Criteria) this;
        }

        public Criteria andConnection_idLessThan(Integer value) {
            addCriterion("connection_id <", value, "connection_id");
            return (Criteria) this;
        }

        public Criteria andConnection_idLessThanOrEqualTo(Integer value) {
            addCriterion("connection_id <=", value, "connection_id");
            return (Criteria) this;
        }

        public Criteria andConnection_idIn(List<Integer> values) {
            addCriterion("connection_id in", values, "connection_id");
            return (Criteria) this;
        }

        public Criteria andConnection_idNotIn(List<Integer> values) {
            addCriterion("connection_id not in", values, "connection_id");
            return (Criteria) this;
        }

        public Criteria andConnection_idBetween(Integer value1, Integer value2) {
            addCriterion("connection_id between", value1, value2, "connection_id");
            return (Criteria) this;
        }

        public Criteria andConnection_idNotBetween(Integer value1, Integer value2) {
            addCriterion("connection_id not between", value1, value2, "connection_id");
            return (Criteria) this;
        }

        public Criteria andPermissionIsNull() {
            addCriterion("permission is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIsNotNull() {
            addCriterion("permission is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionEqualTo(String value) {
            addCriterion("permission =", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotEqualTo(String value) {
            addCriterion("permission <>", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionGreaterThan(String value) {
            addCriterion("permission >", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionGreaterThanOrEqualTo(String value) {
            addCriterion("permission >=", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLessThan(String value) {
            addCriterion("permission <", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLessThanOrEqualTo(String value) {
            addCriterion("permission <=", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLike(String value) {
            addCriterion("permission like", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotLike(String value) {
            addCriterion("permission not like", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionIn(List<String> values) {
            addCriterion("permission in", values, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotIn(List<String> values) {
            addCriterion("permission not in", values, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionBetween(String value1, String value2) {
            addCriterion("permission between", value1, value2, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotBetween(String value1, String value2) {
            addCriterion("permission not between", value1, value2, "permission");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated do_not_delete_during_merge Tue Feb 05 15:45:11 PST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table guacamole..guacamole_connection_permission
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}