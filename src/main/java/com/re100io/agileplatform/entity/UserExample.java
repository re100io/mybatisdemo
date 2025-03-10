package com.re100io.agileplatform.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andHostIsNull() {
            addCriterion("Host is null");
            return (Criteria) this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("Host is not null");
            return (Criteria) this;
        }

        public Criteria andHostEqualTo(String value) {
            addCriterion("Host =", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotEqualTo(String value) {
            addCriterion("Host <>", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThan(String value) {
            addCriterion("Host >", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThanOrEqualTo(String value) {
            addCriterion("Host >=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThan(String value) {
            addCriterion("Host <", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThanOrEqualTo(String value) {
            addCriterion("Host <=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLike(String value) {
            addCriterion("Host like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotLike(String value) {
            addCriterion("Host not like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostIn(List<String> values) {
            addCriterion("Host in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotIn(List<String> values) {
            addCriterion("Host not in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostBetween(String value1, String value2) {
            addCriterion("Host between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotBetween(String value1, String value2) {
            addCriterion("Host not between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andUserIsNull() {
            addCriterion("User is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("User is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("User =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("User <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("User >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("User >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("User <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("User <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("User like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("User not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("User in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("User not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("User between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("User not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andSelectPrivIsNull() {
            addCriterion("Select_priv is null");
            return (Criteria) this;
        }

        public Criteria andSelectPrivIsNotNull() {
            addCriterion("Select_priv is not null");
            return (Criteria) this;
        }

        public Criteria andSelectPrivEqualTo(String value) {
            addCriterion("Select_priv =", value, "selectPriv");
            return (Criteria) this;
        }

        public Criteria andSelectPrivNotEqualTo(String value) {
            addCriterion("Select_priv <>", value, "selectPriv");
            return (Criteria) this;
        }

        public Criteria andSelectPrivGreaterThan(String value) {
            addCriterion("Select_priv >", value, "selectPriv");
            return (Criteria) this;
        }

        public Criteria andSelectPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Select_priv >=", value, "selectPriv");
            return (Criteria) this;
        }

        public Criteria andSelectPrivLessThan(String value) {
            addCriterion("Select_priv <", value, "selectPriv");
            return (Criteria) this;
        }

        public Criteria andSelectPrivLessThanOrEqualTo(String value) {
            addCriterion("Select_priv <=", value, "selectPriv");
            return (Criteria) this;
        }

        public Criteria andSelectPrivLike(String value) {
            addCriterion("Select_priv like", value, "selectPriv");
            return (Criteria) this;
        }

        public Criteria andSelectPrivNotLike(String value) {
            addCriterion("Select_priv not like", value, "selectPriv");
            return (Criteria) this;
        }

        public Criteria andSelectPrivIn(List<String> values) {
            addCriterion("Select_priv in", values, "selectPriv");
            return (Criteria) this;
        }

        public Criteria andSelectPrivNotIn(List<String> values) {
            addCriterion("Select_priv not in", values, "selectPriv");
            return (Criteria) this;
        }

        public Criteria andSelectPrivBetween(String value1, String value2) {
            addCriterion("Select_priv between", value1, value2, "selectPriv");
            return (Criteria) this;
        }

        public Criteria andSelectPrivNotBetween(String value1, String value2) {
            addCriterion("Select_priv not between", value1, value2, "selectPriv");
            return (Criteria) this;
        }

        public Criteria andInsertPrivIsNull() {
            addCriterion("Insert_priv is null");
            return (Criteria) this;
        }

        public Criteria andInsertPrivIsNotNull() {
            addCriterion("Insert_priv is not null");
            return (Criteria) this;
        }

        public Criteria andInsertPrivEqualTo(String value) {
            addCriterion("Insert_priv =", value, "insertPriv");
            return (Criteria) this;
        }

        public Criteria andInsertPrivNotEqualTo(String value) {
            addCriterion("Insert_priv <>", value, "insertPriv");
            return (Criteria) this;
        }

        public Criteria andInsertPrivGreaterThan(String value) {
            addCriterion("Insert_priv >", value, "insertPriv");
            return (Criteria) this;
        }

        public Criteria andInsertPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Insert_priv >=", value, "insertPriv");
            return (Criteria) this;
        }

        public Criteria andInsertPrivLessThan(String value) {
            addCriterion("Insert_priv <", value, "insertPriv");
            return (Criteria) this;
        }

        public Criteria andInsertPrivLessThanOrEqualTo(String value) {
            addCriterion("Insert_priv <=", value, "insertPriv");
            return (Criteria) this;
        }

        public Criteria andInsertPrivLike(String value) {
            addCriterion("Insert_priv like", value, "insertPriv");
            return (Criteria) this;
        }

        public Criteria andInsertPrivNotLike(String value) {
            addCriterion("Insert_priv not like", value, "insertPriv");
            return (Criteria) this;
        }

        public Criteria andInsertPrivIn(List<String> values) {
            addCriterion("Insert_priv in", values, "insertPriv");
            return (Criteria) this;
        }

        public Criteria andInsertPrivNotIn(List<String> values) {
            addCriterion("Insert_priv not in", values, "insertPriv");
            return (Criteria) this;
        }

        public Criteria andInsertPrivBetween(String value1, String value2) {
            addCriterion("Insert_priv between", value1, value2, "insertPriv");
            return (Criteria) this;
        }

        public Criteria andInsertPrivNotBetween(String value1, String value2) {
            addCriterion("Insert_priv not between", value1, value2, "insertPriv");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivIsNull() {
            addCriterion("Update_priv is null");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivIsNotNull() {
            addCriterion("Update_priv is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivEqualTo(String value) {
            addCriterion("Update_priv =", value, "updatePriv");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivNotEqualTo(String value) {
            addCriterion("Update_priv <>", value, "updatePriv");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivGreaterThan(String value) {
            addCriterion("Update_priv >", value, "updatePriv");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivGreaterThanOrEqualTo(String value) {
            addCriterion("Update_priv >=", value, "updatePriv");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivLessThan(String value) {
            addCriterion("Update_priv <", value, "updatePriv");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivLessThanOrEqualTo(String value) {
            addCriterion("Update_priv <=", value, "updatePriv");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivLike(String value) {
            addCriterion("Update_priv like", value, "updatePriv");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivNotLike(String value) {
            addCriterion("Update_priv not like", value, "updatePriv");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivIn(List<String> values) {
            addCriterion("Update_priv in", values, "updatePriv");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivNotIn(List<String> values) {
            addCriterion("Update_priv not in", values, "updatePriv");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivBetween(String value1, String value2) {
            addCriterion("Update_priv between", value1, value2, "updatePriv");
            return (Criteria) this;
        }

        public Criteria andUpdatePrivNotBetween(String value1, String value2) {
            addCriterion("Update_priv not between", value1, value2, "updatePriv");
            return (Criteria) this;
        }

        public Criteria andDeletePrivIsNull() {
            addCriterion("Delete_priv is null");
            return (Criteria) this;
        }

        public Criteria andDeletePrivIsNotNull() {
            addCriterion("Delete_priv is not null");
            return (Criteria) this;
        }

        public Criteria andDeletePrivEqualTo(String value) {
            addCriterion("Delete_priv =", value, "deletePriv");
            return (Criteria) this;
        }

        public Criteria andDeletePrivNotEqualTo(String value) {
            addCriterion("Delete_priv <>", value, "deletePriv");
            return (Criteria) this;
        }

        public Criteria andDeletePrivGreaterThan(String value) {
            addCriterion("Delete_priv >", value, "deletePriv");
            return (Criteria) this;
        }

        public Criteria andDeletePrivGreaterThanOrEqualTo(String value) {
            addCriterion("Delete_priv >=", value, "deletePriv");
            return (Criteria) this;
        }

        public Criteria andDeletePrivLessThan(String value) {
            addCriterion("Delete_priv <", value, "deletePriv");
            return (Criteria) this;
        }

        public Criteria andDeletePrivLessThanOrEqualTo(String value) {
            addCriterion("Delete_priv <=", value, "deletePriv");
            return (Criteria) this;
        }

        public Criteria andDeletePrivLike(String value) {
            addCriterion("Delete_priv like", value, "deletePriv");
            return (Criteria) this;
        }

        public Criteria andDeletePrivNotLike(String value) {
            addCriterion("Delete_priv not like", value, "deletePriv");
            return (Criteria) this;
        }

        public Criteria andDeletePrivIn(List<String> values) {
            addCriterion("Delete_priv in", values, "deletePriv");
            return (Criteria) this;
        }

        public Criteria andDeletePrivNotIn(List<String> values) {
            addCriterion("Delete_priv not in", values, "deletePriv");
            return (Criteria) this;
        }

        public Criteria andDeletePrivBetween(String value1, String value2) {
            addCriterion("Delete_priv between", value1, value2, "deletePriv");
            return (Criteria) this;
        }

        public Criteria andDeletePrivNotBetween(String value1, String value2) {
            addCriterion("Delete_priv not between", value1, value2, "deletePriv");
            return (Criteria) this;
        }

        public Criteria andCreatePrivIsNull() {
            addCriterion("Create_priv is null");
            return (Criteria) this;
        }

        public Criteria andCreatePrivIsNotNull() {
            addCriterion("Create_priv is not null");
            return (Criteria) this;
        }

        public Criteria andCreatePrivEqualTo(String value) {
            addCriterion("Create_priv =", value, "createPriv");
            return (Criteria) this;
        }

        public Criteria andCreatePrivNotEqualTo(String value) {
            addCriterion("Create_priv <>", value, "createPriv");
            return (Criteria) this;
        }

        public Criteria andCreatePrivGreaterThan(String value) {
            addCriterion("Create_priv >", value, "createPriv");
            return (Criteria) this;
        }

        public Criteria andCreatePrivGreaterThanOrEqualTo(String value) {
            addCriterion("Create_priv >=", value, "createPriv");
            return (Criteria) this;
        }

        public Criteria andCreatePrivLessThan(String value) {
            addCriterion("Create_priv <", value, "createPriv");
            return (Criteria) this;
        }

        public Criteria andCreatePrivLessThanOrEqualTo(String value) {
            addCriterion("Create_priv <=", value, "createPriv");
            return (Criteria) this;
        }

        public Criteria andCreatePrivLike(String value) {
            addCriterion("Create_priv like", value, "createPriv");
            return (Criteria) this;
        }

        public Criteria andCreatePrivNotLike(String value) {
            addCriterion("Create_priv not like", value, "createPriv");
            return (Criteria) this;
        }

        public Criteria andCreatePrivIn(List<String> values) {
            addCriterion("Create_priv in", values, "createPriv");
            return (Criteria) this;
        }

        public Criteria andCreatePrivNotIn(List<String> values) {
            addCriterion("Create_priv not in", values, "createPriv");
            return (Criteria) this;
        }

        public Criteria andCreatePrivBetween(String value1, String value2) {
            addCriterion("Create_priv between", value1, value2, "createPriv");
            return (Criteria) this;
        }

        public Criteria andCreatePrivNotBetween(String value1, String value2) {
            addCriterion("Create_priv not between", value1, value2, "createPriv");
            return (Criteria) this;
        }

        public Criteria andDropPrivIsNull() {
            addCriterion("Drop_priv is null");
            return (Criteria) this;
        }

        public Criteria andDropPrivIsNotNull() {
            addCriterion("Drop_priv is not null");
            return (Criteria) this;
        }

        public Criteria andDropPrivEqualTo(String value) {
            addCriterion("Drop_priv =", value, "dropPriv");
            return (Criteria) this;
        }

        public Criteria andDropPrivNotEqualTo(String value) {
            addCriterion("Drop_priv <>", value, "dropPriv");
            return (Criteria) this;
        }

        public Criteria andDropPrivGreaterThan(String value) {
            addCriterion("Drop_priv >", value, "dropPriv");
            return (Criteria) this;
        }

        public Criteria andDropPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Drop_priv >=", value, "dropPriv");
            return (Criteria) this;
        }

        public Criteria andDropPrivLessThan(String value) {
            addCriterion("Drop_priv <", value, "dropPriv");
            return (Criteria) this;
        }

        public Criteria andDropPrivLessThanOrEqualTo(String value) {
            addCriterion("Drop_priv <=", value, "dropPriv");
            return (Criteria) this;
        }

        public Criteria andDropPrivLike(String value) {
            addCriterion("Drop_priv like", value, "dropPriv");
            return (Criteria) this;
        }

        public Criteria andDropPrivNotLike(String value) {
            addCriterion("Drop_priv not like", value, "dropPriv");
            return (Criteria) this;
        }

        public Criteria andDropPrivIn(List<String> values) {
            addCriterion("Drop_priv in", values, "dropPriv");
            return (Criteria) this;
        }

        public Criteria andDropPrivNotIn(List<String> values) {
            addCriterion("Drop_priv not in", values, "dropPriv");
            return (Criteria) this;
        }

        public Criteria andDropPrivBetween(String value1, String value2) {
            addCriterion("Drop_priv between", value1, value2, "dropPriv");
            return (Criteria) this;
        }

        public Criteria andDropPrivNotBetween(String value1, String value2) {
            addCriterion("Drop_priv not between", value1, value2, "dropPriv");
            return (Criteria) this;
        }

        public Criteria andReloadPrivIsNull() {
            addCriterion("Reload_priv is null");
            return (Criteria) this;
        }

        public Criteria andReloadPrivIsNotNull() {
            addCriterion("Reload_priv is not null");
            return (Criteria) this;
        }

        public Criteria andReloadPrivEqualTo(String value) {
            addCriterion("Reload_priv =", value, "reloadPriv");
            return (Criteria) this;
        }

        public Criteria andReloadPrivNotEqualTo(String value) {
            addCriterion("Reload_priv <>", value, "reloadPriv");
            return (Criteria) this;
        }

        public Criteria andReloadPrivGreaterThan(String value) {
            addCriterion("Reload_priv >", value, "reloadPriv");
            return (Criteria) this;
        }

        public Criteria andReloadPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Reload_priv >=", value, "reloadPriv");
            return (Criteria) this;
        }

        public Criteria andReloadPrivLessThan(String value) {
            addCriterion("Reload_priv <", value, "reloadPriv");
            return (Criteria) this;
        }

        public Criteria andReloadPrivLessThanOrEqualTo(String value) {
            addCriterion("Reload_priv <=", value, "reloadPriv");
            return (Criteria) this;
        }

        public Criteria andReloadPrivLike(String value) {
            addCriterion("Reload_priv like", value, "reloadPriv");
            return (Criteria) this;
        }

        public Criteria andReloadPrivNotLike(String value) {
            addCriterion("Reload_priv not like", value, "reloadPriv");
            return (Criteria) this;
        }

        public Criteria andReloadPrivIn(List<String> values) {
            addCriterion("Reload_priv in", values, "reloadPriv");
            return (Criteria) this;
        }

        public Criteria andReloadPrivNotIn(List<String> values) {
            addCriterion("Reload_priv not in", values, "reloadPriv");
            return (Criteria) this;
        }

        public Criteria andReloadPrivBetween(String value1, String value2) {
            addCriterion("Reload_priv between", value1, value2, "reloadPriv");
            return (Criteria) this;
        }

        public Criteria andReloadPrivNotBetween(String value1, String value2) {
            addCriterion("Reload_priv not between", value1, value2, "reloadPriv");
            return (Criteria) this;
        }

        public Criteria andShutdownPrivIsNull() {
            addCriterion("Shutdown_priv is null");
            return (Criteria) this;
        }

        public Criteria andShutdownPrivIsNotNull() {
            addCriterion("Shutdown_priv is not null");
            return (Criteria) this;
        }

        public Criteria andShutdownPrivEqualTo(String value) {
            addCriterion("Shutdown_priv =", value, "shutdownPriv");
            return (Criteria) this;
        }

        public Criteria andShutdownPrivNotEqualTo(String value) {
            addCriterion("Shutdown_priv <>", value, "shutdownPriv");
            return (Criteria) this;
        }

        public Criteria andShutdownPrivGreaterThan(String value) {
            addCriterion("Shutdown_priv >", value, "shutdownPriv");
            return (Criteria) this;
        }

        public Criteria andShutdownPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Shutdown_priv >=", value, "shutdownPriv");
            return (Criteria) this;
        }

        public Criteria andShutdownPrivLessThan(String value) {
            addCriterion("Shutdown_priv <", value, "shutdownPriv");
            return (Criteria) this;
        }

        public Criteria andShutdownPrivLessThanOrEqualTo(String value) {
            addCriterion("Shutdown_priv <=", value, "shutdownPriv");
            return (Criteria) this;
        }

        public Criteria andShutdownPrivLike(String value) {
            addCriterion("Shutdown_priv like", value, "shutdownPriv");
            return (Criteria) this;
        }

        public Criteria andShutdownPrivNotLike(String value) {
            addCriterion("Shutdown_priv not like", value, "shutdownPriv");
            return (Criteria) this;
        }

        public Criteria andShutdownPrivIn(List<String> values) {
            addCriterion("Shutdown_priv in", values, "shutdownPriv");
            return (Criteria) this;
        }

        public Criteria andShutdownPrivNotIn(List<String> values) {
            addCriterion("Shutdown_priv not in", values, "shutdownPriv");
            return (Criteria) this;
        }

        public Criteria andShutdownPrivBetween(String value1, String value2) {
            addCriterion("Shutdown_priv between", value1, value2, "shutdownPriv");
            return (Criteria) this;
        }

        public Criteria andShutdownPrivNotBetween(String value1, String value2) {
            addCriterion("Shutdown_priv not between", value1, value2, "shutdownPriv");
            return (Criteria) this;
        }

        public Criteria andProcessPrivIsNull() {
            addCriterion("Process_priv is null");
            return (Criteria) this;
        }

        public Criteria andProcessPrivIsNotNull() {
            addCriterion("Process_priv is not null");
            return (Criteria) this;
        }

        public Criteria andProcessPrivEqualTo(String value) {
            addCriterion("Process_priv =", value, "processPriv");
            return (Criteria) this;
        }

        public Criteria andProcessPrivNotEqualTo(String value) {
            addCriterion("Process_priv <>", value, "processPriv");
            return (Criteria) this;
        }

        public Criteria andProcessPrivGreaterThan(String value) {
            addCriterion("Process_priv >", value, "processPriv");
            return (Criteria) this;
        }

        public Criteria andProcessPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Process_priv >=", value, "processPriv");
            return (Criteria) this;
        }

        public Criteria andProcessPrivLessThan(String value) {
            addCriterion("Process_priv <", value, "processPriv");
            return (Criteria) this;
        }

        public Criteria andProcessPrivLessThanOrEqualTo(String value) {
            addCriterion("Process_priv <=", value, "processPriv");
            return (Criteria) this;
        }

        public Criteria andProcessPrivLike(String value) {
            addCriterion("Process_priv like", value, "processPriv");
            return (Criteria) this;
        }

        public Criteria andProcessPrivNotLike(String value) {
            addCriterion("Process_priv not like", value, "processPriv");
            return (Criteria) this;
        }

        public Criteria andProcessPrivIn(List<String> values) {
            addCriterion("Process_priv in", values, "processPriv");
            return (Criteria) this;
        }

        public Criteria andProcessPrivNotIn(List<String> values) {
            addCriterion("Process_priv not in", values, "processPriv");
            return (Criteria) this;
        }

        public Criteria andProcessPrivBetween(String value1, String value2) {
            addCriterion("Process_priv between", value1, value2, "processPriv");
            return (Criteria) this;
        }

        public Criteria andProcessPrivNotBetween(String value1, String value2) {
            addCriterion("Process_priv not between", value1, value2, "processPriv");
            return (Criteria) this;
        }

        public Criteria andFilePrivIsNull() {
            addCriterion("File_priv is null");
            return (Criteria) this;
        }

        public Criteria andFilePrivIsNotNull() {
            addCriterion("File_priv is not null");
            return (Criteria) this;
        }

        public Criteria andFilePrivEqualTo(String value) {
            addCriterion("File_priv =", value, "filePriv");
            return (Criteria) this;
        }

        public Criteria andFilePrivNotEqualTo(String value) {
            addCriterion("File_priv <>", value, "filePriv");
            return (Criteria) this;
        }

        public Criteria andFilePrivGreaterThan(String value) {
            addCriterion("File_priv >", value, "filePriv");
            return (Criteria) this;
        }

        public Criteria andFilePrivGreaterThanOrEqualTo(String value) {
            addCriterion("File_priv >=", value, "filePriv");
            return (Criteria) this;
        }

        public Criteria andFilePrivLessThan(String value) {
            addCriterion("File_priv <", value, "filePriv");
            return (Criteria) this;
        }

        public Criteria andFilePrivLessThanOrEqualTo(String value) {
            addCriterion("File_priv <=", value, "filePriv");
            return (Criteria) this;
        }

        public Criteria andFilePrivLike(String value) {
            addCriterion("File_priv like", value, "filePriv");
            return (Criteria) this;
        }

        public Criteria andFilePrivNotLike(String value) {
            addCriterion("File_priv not like", value, "filePriv");
            return (Criteria) this;
        }

        public Criteria andFilePrivIn(List<String> values) {
            addCriterion("File_priv in", values, "filePriv");
            return (Criteria) this;
        }

        public Criteria andFilePrivNotIn(List<String> values) {
            addCriterion("File_priv not in", values, "filePriv");
            return (Criteria) this;
        }

        public Criteria andFilePrivBetween(String value1, String value2) {
            addCriterion("File_priv between", value1, value2, "filePriv");
            return (Criteria) this;
        }

        public Criteria andFilePrivNotBetween(String value1, String value2) {
            addCriterion("File_priv not between", value1, value2, "filePriv");
            return (Criteria) this;
        }

        public Criteria andGrantPrivIsNull() {
            addCriterion("Grant_priv is null");
            return (Criteria) this;
        }

        public Criteria andGrantPrivIsNotNull() {
            addCriterion("Grant_priv is not null");
            return (Criteria) this;
        }

        public Criteria andGrantPrivEqualTo(String value) {
            addCriterion("Grant_priv =", value, "grantPriv");
            return (Criteria) this;
        }

        public Criteria andGrantPrivNotEqualTo(String value) {
            addCriterion("Grant_priv <>", value, "grantPriv");
            return (Criteria) this;
        }

        public Criteria andGrantPrivGreaterThan(String value) {
            addCriterion("Grant_priv >", value, "grantPriv");
            return (Criteria) this;
        }

        public Criteria andGrantPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Grant_priv >=", value, "grantPriv");
            return (Criteria) this;
        }

        public Criteria andGrantPrivLessThan(String value) {
            addCriterion("Grant_priv <", value, "grantPriv");
            return (Criteria) this;
        }

        public Criteria andGrantPrivLessThanOrEqualTo(String value) {
            addCriterion("Grant_priv <=", value, "grantPriv");
            return (Criteria) this;
        }

        public Criteria andGrantPrivLike(String value) {
            addCriterion("Grant_priv like", value, "grantPriv");
            return (Criteria) this;
        }

        public Criteria andGrantPrivNotLike(String value) {
            addCriterion("Grant_priv not like", value, "grantPriv");
            return (Criteria) this;
        }

        public Criteria andGrantPrivIn(List<String> values) {
            addCriterion("Grant_priv in", values, "grantPriv");
            return (Criteria) this;
        }

        public Criteria andGrantPrivNotIn(List<String> values) {
            addCriterion("Grant_priv not in", values, "grantPriv");
            return (Criteria) this;
        }

        public Criteria andGrantPrivBetween(String value1, String value2) {
            addCriterion("Grant_priv between", value1, value2, "grantPriv");
            return (Criteria) this;
        }

        public Criteria andGrantPrivNotBetween(String value1, String value2) {
            addCriterion("Grant_priv not between", value1, value2, "grantPriv");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivIsNull() {
            addCriterion("References_priv is null");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivIsNotNull() {
            addCriterion("References_priv is not null");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivEqualTo(String value) {
            addCriterion("References_priv =", value, "referencesPriv");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivNotEqualTo(String value) {
            addCriterion("References_priv <>", value, "referencesPriv");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivGreaterThan(String value) {
            addCriterion("References_priv >", value, "referencesPriv");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivGreaterThanOrEqualTo(String value) {
            addCriterion("References_priv >=", value, "referencesPriv");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivLessThan(String value) {
            addCriterion("References_priv <", value, "referencesPriv");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivLessThanOrEqualTo(String value) {
            addCriterion("References_priv <=", value, "referencesPriv");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivLike(String value) {
            addCriterion("References_priv like", value, "referencesPriv");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivNotLike(String value) {
            addCriterion("References_priv not like", value, "referencesPriv");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivIn(List<String> values) {
            addCriterion("References_priv in", values, "referencesPriv");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivNotIn(List<String> values) {
            addCriterion("References_priv not in", values, "referencesPriv");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivBetween(String value1, String value2) {
            addCriterion("References_priv between", value1, value2, "referencesPriv");
            return (Criteria) this;
        }

        public Criteria andReferencesPrivNotBetween(String value1, String value2) {
            addCriterion("References_priv not between", value1, value2, "referencesPriv");
            return (Criteria) this;
        }

        public Criteria andIndexPrivIsNull() {
            addCriterion("Index_priv is null");
            return (Criteria) this;
        }

        public Criteria andIndexPrivIsNotNull() {
            addCriterion("Index_priv is not null");
            return (Criteria) this;
        }

        public Criteria andIndexPrivEqualTo(String value) {
            addCriterion("Index_priv =", value, "indexPriv");
            return (Criteria) this;
        }

        public Criteria andIndexPrivNotEqualTo(String value) {
            addCriterion("Index_priv <>", value, "indexPriv");
            return (Criteria) this;
        }

        public Criteria andIndexPrivGreaterThan(String value) {
            addCriterion("Index_priv >", value, "indexPriv");
            return (Criteria) this;
        }

        public Criteria andIndexPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Index_priv >=", value, "indexPriv");
            return (Criteria) this;
        }

        public Criteria andIndexPrivLessThan(String value) {
            addCriterion("Index_priv <", value, "indexPriv");
            return (Criteria) this;
        }

        public Criteria andIndexPrivLessThanOrEqualTo(String value) {
            addCriterion("Index_priv <=", value, "indexPriv");
            return (Criteria) this;
        }

        public Criteria andIndexPrivLike(String value) {
            addCriterion("Index_priv like", value, "indexPriv");
            return (Criteria) this;
        }

        public Criteria andIndexPrivNotLike(String value) {
            addCriterion("Index_priv not like", value, "indexPriv");
            return (Criteria) this;
        }

        public Criteria andIndexPrivIn(List<String> values) {
            addCriterion("Index_priv in", values, "indexPriv");
            return (Criteria) this;
        }

        public Criteria andIndexPrivNotIn(List<String> values) {
            addCriterion("Index_priv not in", values, "indexPriv");
            return (Criteria) this;
        }

        public Criteria andIndexPrivBetween(String value1, String value2) {
            addCriterion("Index_priv between", value1, value2, "indexPriv");
            return (Criteria) this;
        }

        public Criteria andIndexPrivNotBetween(String value1, String value2) {
            addCriterion("Index_priv not between", value1, value2, "indexPriv");
            return (Criteria) this;
        }

        public Criteria andAlterPrivIsNull() {
            addCriterion("Alter_priv is null");
            return (Criteria) this;
        }

        public Criteria andAlterPrivIsNotNull() {
            addCriterion("Alter_priv is not null");
            return (Criteria) this;
        }

        public Criteria andAlterPrivEqualTo(String value) {
            addCriterion("Alter_priv =", value, "alterPriv");
            return (Criteria) this;
        }

        public Criteria andAlterPrivNotEqualTo(String value) {
            addCriterion("Alter_priv <>", value, "alterPriv");
            return (Criteria) this;
        }

        public Criteria andAlterPrivGreaterThan(String value) {
            addCriterion("Alter_priv >", value, "alterPriv");
            return (Criteria) this;
        }

        public Criteria andAlterPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Alter_priv >=", value, "alterPriv");
            return (Criteria) this;
        }

        public Criteria andAlterPrivLessThan(String value) {
            addCriterion("Alter_priv <", value, "alterPriv");
            return (Criteria) this;
        }

        public Criteria andAlterPrivLessThanOrEqualTo(String value) {
            addCriterion("Alter_priv <=", value, "alterPriv");
            return (Criteria) this;
        }

        public Criteria andAlterPrivLike(String value) {
            addCriterion("Alter_priv like", value, "alterPriv");
            return (Criteria) this;
        }

        public Criteria andAlterPrivNotLike(String value) {
            addCriterion("Alter_priv not like", value, "alterPriv");
            return (Criteria) this;
        }

        public Criteria andAlterPrivIn(List<String> values) {
            addCriterion("Alter_priv in", values, "alterPriv");
            return (Criteria) this;
        }

        public Criteria andAlterPrivNotIn(List<String> values) {
            addCriterion("Alter_priv not in", values, "alterPriv");
            return (Criteria) this;
        }

        public Criteria andAlterPrivBetween(String value1, String value2) {
            addCriterion("Alter_priv between", value1, value2, "alterPriv");
            return (Criteria) this;
        }

        public Criteria andAlterPrivNotBetween(String value1, String value2) {
            addCriterion("Alter_priv not between", value1, value2, "alterPriv");
            return (Criteria) this;
        }

        public Criteria andShowDbPrivIsNull() {
            addCriterion("Show_db_priv is null");
            return (Criteria) this;
        }

        public Criteria andShowDbPrivIsNotNull() {
            addCriterion("Show_db_priv is not null");
            return (Criteria) this;
        }

        public Criteria andShowDbPrivEqualTo(String value) {
            addCriterion("Show_db_priv =", value, "showDbPriv");
            return (Criteria) this;
        }

        public Criteria andShowDbPrivNotEqualTo(String value) {
            addCriterion("Show_db_priv <>", value, "showDbPriv");
            return (Criteria) this;
        }

        public Criteria andShowDbPrivGreaterThan(String value) {
            addCriterion("Show_db_priv >", value, "showDbPriv");
            return (Criteria) this;
        }

        public Criteria andShowDbPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Show_db_priv >=", value, "showDbPriv");
            return (Criteria) this;
        }

        public Criteria andShowDbPrivLessThan(String value) {
            addCriterion("Show_db_priv <", value, "showDbPriv");
            return (Criteria) this;
        }

        public Criteria andShowDbPrivLessThanOrEqualTo(String value) {
            addCriterion("Show_db_priv <=", value, "showDbPriv");
            return (Criteria) this;
        }

        public Criteria andShowDbPrivLike(String value) {
            addCriterion("Show_db_priv like", value, "showDbPriv");
            return (Criteria) this;
        }

        public Criteria andShowDbPrivNotLike(String value) {
            addCriterion("Show_db_priv not like", value, "showDbPriv");
            return (Criteria) this;
        }

        public Criteria andShowDbPrivIn(List<String> values) {
            addCriterion("Show_db_priv in", values, "showDbPriv");
            return (Criteria) this;
        }

        public Criteria andShowDbPrivNotIn(List<String> values) {
            addCriterion("Show_db_priv not in", values, "showDbPriv");
            return (Criteria) this;
        }

        public Criteria andShowDbPrivBetween(String value1, String value2) {
            addCriterion("Show_db_priv between", value1, value2, "showDbPriv");
            return (Criteria) this;
        }

        public Criteria andShowDbPrivNotBetween(String value1, String value2) {
            addCriterion("Show_db_priv not between", value1, value2, "showDbPriv");
            return (Criteria) this;
        }

        public Criteria andSuperPrivIsNull() {
            addCriterion("Super_priv is null");
            return (Criteria) this;
        }

        public Criteria andSuperPrivIsNotNull() {
            addCriterion("Super_priv is not null");
            return (Criteria) this;
        }

        public Criteria andSuperPrivEqualTo(String value) {
            addCriterion("Super_priv =", value, "superPriv");
            return (Criteria) this;
        }

        public Criteria andSuperPrivNotEqualTo(String value) {
            addCriterion("Super_priv <>", value, "superPriv");
            return (Criteria) this;
        }

        public Criteria andSuperPrivGreaterThan(String value) {
            addCriterion("Super_priv >", value, "superPriv");
            return (Criteria) this;
        }

        public Criteria andSuperPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Super_priv >=", value, "superPriv");
            return (Criteria) this;
        }

        public Criteria andSuperPrivLessThan(String value) {
            addCriterion("Super_priv <", value, "superPriv");
            return (Criteria) this;
        }

        public Criteria andSuperPrivLessThanOrEqualTo(String value) {
            addCriterion("Super_priv <=", value, "superPriv");
            return (Criteria) this;
        }

        public Criteria andSuperPrivLike(String value) {
            addCriterion("Super_priv like", value, "superPriv");
            return (Criteria) this;
        }

        public Criteria andSuperPrivNotLike(String value) {
            addCriterion("Super_priv not like", value, "superPriv");
            return (Criteria) this;
        }

        public Criteria andSuperPrivIn(List<String> values) {
            addCriterion("Super_priv in", values, "superPriv");
            return (Criteria) this;
        }

        public Criteria andSuperPrivNotIn(List<String> values) {
            addCriterion("Super_priv not in", values, "superPriv");
            return (Criteria) this;
        }

        public Criteria andSuperPrivBetween(String value1, String value2) {
            addCriterion("Super_priv between", value1, value2, "superPriv");
            return (Criteria) this;
        }

        public Criteria andSuperPrivNotBetween(String value1, String value2) {
            addCriterion("Super_priv not between", value1, value2, "superPriv");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivIsNull() {
            addCriterion("Create_tmp_table_priv is null");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivIsNotNull() {
            addCriterion("Create_tmp_table_priv is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivEqualTo(String value) {
            addCriterion("Create_tmp_table_priv =", value, "createTmpTablePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivNotEqualTo(String value) {
            addCriterion("Create_tmp_table_priv <>", value, "createTmpTablePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivGreaterThan(String value) {
            addCriterion("Create_tmp_table_priv >", value, "createTmpTablePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivGreaterThanOrEqualTo(String value) {
            addCriterion("Create_tmp_table_priv >=", value, "createTmpTablePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivLessThan(String value) {
            addCriterion("Create_tmp_table_priv <", value, "createTmpTablePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivLessThanOrEqualTo(String value) {
            addCriterion("Create_tmp_table_priv <=", value, "createTmpTablePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivLike(String value) {
            addCriterion("Create_tmp_table_priv like", value, "createTmpTablePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivNotLike(String value) {
            addCriterion("Create_tmp_table_priv not like", value, "createTmpTablePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivIn(List<String> values) {
            addCriterion("Create_tmp_table_priv in", values, "createTmpTablePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivNotIn(List<String> values) {
            addCriterion("Create_tmp_table_priv not in", values, "createTmpTablePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivBetween(String value1, String value2) {
            addCriterion("Create_tmp_table_priv between", value1, value2, "createTmpTablePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTmpTablePrivNotBetween(String value1, String value2) {
            addCriterion("Create_tmp_table_priv not between", value1, value2, "createTmpTablePriv");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivIsNull() {
            addCriterion("Lock_tables_priv is null");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivIsNotNull() {
            addCriterion("Lock_tables_priv is not null");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivEqualTo(String value) {
            addCriterion("Lock_tables_priv =", value, "lockTablesPriv");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivNotEqualTo(String value) {
            addCriterion("Lock_tables_priv <>", value, "lockTablesPriv");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivGreaterThan(String value) {
            addCriterion("Lock_tables_priv >", value, "lockTablesPriv");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Lock_tables_priv >=", value, "lockTablesPriv");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivLessThan(String value) {
            addCriterion("Lock_tables_priv <", value, "lockTablesPriv");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivLessThanOrEqualTo(String value) {
            addCriterion("Lock_tables_priv <=", value, "lockTablesPriv");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivLike(String value) {
            addCriterion("Lock_tables_priv like", value, "lockTablesPriv");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivNotLike(String value) {
            addCriterion("Lock_tables_priv not like", value, "lockTablesPriv");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivIn(List<String> values) {
            addCriterion("Lock_tables_priv in", values, "lockTablesPriv");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivNotIn(List<String> values) {
            addCriterion("Lock_tables_priv not in", values, "lockTablesPriv");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivBetween(String value1, String value2) {
            addCriterion("Lock_tables_priv between", value1, value2, "lockTablesPriv");
            return (Criteria) this;
        }

        public Criteria andLockTablesPrivNotBetween(String value1, String value2) {
            addCriterion("Lock_tables_priv not between", value1, value2, "lockTablesPriv");
            return (Criteria) this;
        }

        public Criteria andExecutePrivIsNull() {
            addCriterion("Execute_priv is null");
            return (Criteria) this;
        }

        public Criteria andExecutePrivIsNotNull() {
            addCriterion("Execute_priv is not null");
            return (Criteria) this;
        }

        public Criteria andExecutePrivEqualTo(String value) {
            addCriterion("Execute_priv =", value, "executePriv");
            return (Criteria) this;
        }

        public Criteria andExecutePrivNotEqualTo(String value) {
            addCriterion("Execute_priv <>", value, "executePriv");
            return (Criteria) this;
        }

        public Criteria andExecutePrivGreaterThan(String value) {
            addCriterion("Execute_priv >", value, "executePriv");
            return (Criteria) this;
        }

        public Criteria andExecutePrivGreaterThanOrEqualTo(String value) {
            addCriterion("Execute_priv >=", value, "executePriv");
            return (Criteria) this;
        }

        public Criteria andExecutePrivLessThan(String value) {
            addCriterion("Execute_priv <", value, "executePriv");
            return (Criteria) this;
        }

        public Criteria andExecutePrivLessThanOrEqualTo(String value) {
            addCriterion("Execute_priv <=", value, "executePriv");
            return (Criteria) this;
        }

        public Criteria andExecutePrivLike(String value) {
            addCriterion("Execute_priv like", value, "executePriv");
            return (Criteria) this;
        }

        public Criteria andExecutePrivNotLike(String value) {
            addCriterion("Execute_priv not like", value, "executePriv");
            return (Criteria) this;
        }

        public Criteria andExecutePrivIn(List<String> values) {
            addCriterion("Execute_priv in", values, "executePriv");
            return (Criteria) this;
        }

        public Criteria andExecutePrivNotIn(List<String> values) {
            addCriterion("Execute_priv not in", values, "executePriv");
            return (Criteria) this;
        }

        public Criteria andExecutePrivBetween(String value1, String value2) {
            addCriterion("Execute_priv between", value1, value2, "executePriv");
            return (Criteria) this;
        }

        public Criteria andExecutePrivNotBetween(String value1, String value2) {
            addCriterion("Execute_priv not between", value1, value2, "executePriv");
            return (Criteria) this;
        }

        public Criteria andReplSlavePrivIsNull() {
            addCriterion("Repl_slave_priv is null");
            return (Criteria) this;
        }

        public Criteria andReplSlavePrivIsNotNull() {
            addCriterion("Repl_slave_priv is not null");
            return (Criteria) this;
        }

        public Criteria andReplSlavePrivEqualTo(String value) {
            addCriterion("Repl_slave_priv =", value, "replSlavePriv");
            return (Criteria) this;
        }

        public Criteria andReplSlavePrivNotEqualTo(String value) {
            addCriterion("Repl_slave_priv <>", value, "replSlavePriv");
            return (Criteria) this;
        }

        public Criteria andReplSlavePrivGreaterThan(String value) {
            addCriterion("Repl_slave_priv >", value, "replSlavePriv");
            return (Criteria) this;
        }

        public Criteria andReplSlavePrivGreaterThanOrEqualTo(String value) {
            addCriterion("Repl_slave_priv >=", value, "replSlavePriv");
            return (Criteria) this;
        }

        public Criteria andReplSlavePrivLessThan(String value) {
            addCriterion("Repl_slave_priv <", value, "replSlavePriv");
            return (Criteria) this;
        }

        public Criteria andReplSlavePrivLessThanOrEqualTo(String value) {
            addCriterion("Repl_slave_priv <=", value, "replSlavePriv");
            return (Criteria) this;
        }

        public Criteria andReplSlavePrivLike(String value) {
            addCriterion("Repl_slave_priv like", value, "replSlavePriv");
            return (Criteria) this;
        }

        public Criteria andReplSlavePrivNotLike(String value) {
            addCriterion("Repl_slave_priv not like", value, "replSlavePriv");
            return (Criteria) this;
        }

        public Criteria andReplSlavePrivIn(List<String> values) {
            addCriterion("Repl_slave_priv in", values, "replSlavePriv");
            return (Criteria) this;
        }

        public Criteria andReplSlavePrivNotIn(List<String> values) {
            addCriterion("Repl_slave_priv not in", values, "replSlavePriv");
            return (Criteria) this;
        }

        public Criteria andReplSlavePrivBetween(String value1, String value2) {
            addCriterion("Repl_slave_priv between", value1, value2, "replSlavePriv");
            return (Criteria) this;
        }

        public Criteria andReplSlavePrivNotBetween(String value1, String value2) {
            addCriterion("Repl_slave_priv not between", value1, value2, "replSlavePriv");
            return (Criteria) this;
        }

        public Criteria andReplClientPrivIsNull() {
            addCriterion("Repl_client_priv is null");
            return (Criteria) this;
        }

        public Criteria andReplClientPrivIsNotNull() {
            addCriterion("Repl_client_priv is not null");
            return (Criteria) this;
        }

        public Criteria andReplClientPrivEqualTo(String value) {
            addCriterion("Repl_client_priv =", value, "replClientPriv");
            return (Criteria) this;
        }

        public Criteria andReplClientPrivNotEqualTo(String value) {
            addCriterion("Repl_client_priv <>", value, "replClientPriv");
            return (Criteria) this;
        }

        public Criteria andReplClientPrivGreaterThan(String value) {
            addCriterion("Repl_client_priv >", value, "replClientPriv");
            return (Criteria) this;
        }

        public Criteria andReplClientPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Repl_client_priv >=", value, "replClientPriv");
            return (Criteria) this;
        }

        public Criteria andReplClientPrivLessThan(String value) {
            addCriterion("Repl_client_priv <", value, "replClientPriv");
            return (Criteria) this;
        }

        public Criteria andReplClientPrivLessThanOrEqualTo(String value) {
            addCriterion("Repl_client_priv <=", value, "replClientPriv");
            return (Criteria) this;
        }

        public Criteria andReplClientPrivLike(String value) {
            addCriterion("Repl_client_priv like", value, "replClientPriv");
            return (Criteria) this;
        }

        public Criteria andReplClientPrivNotLike(String value) {
            addCriterion("Repl_client_priv not like", value, "replClientPriv");
            return (Criteria) this;
        }

        public Criteria andReplClientPrivIn(List<String> values) {
            addCriterion("Repl_client_priv in", values, "replClientPriv");
            return (Criteria) this;
        }

        public Criteria andReplClientPrivNotIn(List<String> values) {
            addCriterion("Repl_client_priv not in", values, "replClientPriv");
            return (Criteria) this;
        }

        public Criteria andReplClientPrivBetween(String value1, String value2) {
            addCriterion("Repl_client_priv between", value1, value2, "replClientPriv");
            return (Criteria) this;
        }

        public Criteria andReplClientPrivNotBetween(String value1, String value2) {
            addCriterion("Repl_client_priv not between", value1, value2, "replClientPriv");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivIsNull() {
            addCriterion("Create_view_priv is null");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivIsNotNull() {
            addCriterion("Create_view_priv is not null");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivEqualTo(String value) {
            addCriterion("Create_view_priv =", value, "createViewPriv");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivNotEqualTo(String value) {
            addCriterion("Create_view_priv <>", value, "createViewPriv");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivGreaterThan(String value) {
            addCriterion("Create_view_priv >", value, "createViewPriv");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Create_view_priv >=", value, "createViewPriv");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivLessThan(String value) {
            addCriterion("Create_view_priv <", value, "createViewPriv");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivLessThanOrEqualTo(String value) {
            addCriterion("Create_view_priv <=", value, "createViewPriv");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivLike(String value) {
            addCriterion("Create_view_priv like", value, "createViewPriv");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivNotLike(String value) {
            addCriterion("Create_view_priv not like", value, "createViewPriv");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivIn(List<String> values) {
            addCriterion("Create_view_priv in", values, "createViewPriv");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivNotIn(List<String> values) {
            addCriterion("Create_view_priv not in", values, "createViewPriv");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivBetween(String value1, String value2) {
            addCriterion("Create_view_priv between", value1, value2, "createViewPriv");
            return (Criteria) this;
        }

        public Criteria andCreateViewPrivNotBetween(String value1, String value2) {
            addCriterion("Create_view_priv not between", value1, value2, "createViewPriv");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivIsNull() {
            addCriterion("Show_view_priv is null");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivIsNotNull() {
            addCriterion("Show_view_priv is not null");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivEqualTo(String value) {
            addCriterion("Show_view_priv =", value, "showViewPriv");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivNotEqualTo(String value) {
            addCriterion("Show_view_priv <>", value, "showViewPriv");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivGreaterThan(String value) {
            addCriterion("Show_view_priv >", value, "showViewPriv");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Show_view_priv >=", value, "showViewPriv");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivLessThan(String value) {
            addCriterion("Show_view_priv <", value, "showViewPriv");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivLessThanOrEqualTo(String value) {
            addCriterion("Show_view_priv <=", value, "showViewPriv");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivLike(String value) {
            addCriterion("Show_view_priv like", value, "showViewPriv");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivNotLike(String value) {
            addCriterion("Show_view_priv not like", value, "showViewPriv");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivIn(List<String> values) {
            addCriterion("Show_view_priv in", values, "showViewPriv");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivNotIn(List<String> values) {
            addCriterion("Show_view_priv not in", values, "showViewPriv");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivBetween(String value1, String value2) {
            addCriterion("Show_view_priv between", value1, value2, "showViewPriv");
            return (Criteria) this;
        }

        public Criteria andShowViewPrivNotBetween(String value1, String value2) {
            addCriterion("Show_view_priv not between", value1, value2, "showViewPriv");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivIsNull() {
            addCriterion("Create_routine_priv is null");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivIsNotNull() {
            addCriterion("Create_routine_priv is not null");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivEqualTo(String value) {
            addCriterion("Create_routine_priv =", value, "createRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivNotEqualTo(String value) {
            addCriterion("Create_routine_priv <>", value, "createRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivGreaterThan(String value) {
            addCriterion("Create_routine_priv >", value, "createRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivGreaterThanOrEqualTo(String value) {
            addCriterion("Create_routine_priv >=", value, "createRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivLessThan(String value) {
            addCriterion("Create_routine_priv <", value, "createRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivLessThanOrEqualTo(String value) {
            addCriterion("Create_routine_priv <=", value, "createRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivLike(String value) {
            addCriterion("Create_routine_priv like", value, "createRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivNotLike(String value) {
            addCriterion("Create_routine_priv not like", value, "createRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivIn(List<String> values) {
            addCriterion("Create_routine_priv in", values, "createRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivNotIn(List<String> values) {
            addCriterion("Create_routine_priv not in", values, "createRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivBetween(String value1, String value2) {
            addCriterion("Create_routine_priv between", value1, value2, "createRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRoutinePrivNotBetween(String value1, String value2) {
            addCriterion("Create_routine_priv not between", value1, value2, "createRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivIsNull() {
            addCriterion("Alter_routine_priv is null");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivIsNotNull() {
            addCriterion("Alter_routine_priv is not null");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivEqualTo(String value) {
            addCriterion("Alter_routine_priv =", value, "alterRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivNotEqualTo(String value) {
            addCriterion("Alter_routine_priv <>", value, "alterRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivGreaterThan(String value) {
            addCriterion("Alter_routine_priv >", value, "alterRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivGreaterThanOrEqualTo(String value) {
            addCriterion("Alter_routine_priv >=", value, "alterRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivLessThan(String value) {
            addCriterion("Alter_routine_priv <", value, "alterRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivLessThanOrEqualTo(String value) {
            addCriterion("Alter_routine_priv <=", value, "alterRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivLike(String value) {
            addCriterion("Alter_routine_priv like", value, "alterRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivNotLike(String value) {
            addCriterion("Alter_routine_priv not like", value, "alterRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivIn(List<String> values) {
            addCriterion("Alter_routine_priv in", values, "alterRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivNotIn(List<String> values) {
            addCriterion("Alter_routine_priv not in", values, "alterRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivBetween(String value1, String value2) {
            addCriterion("Alter_routine_priv between", value1, value2, "alterRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andAlterRoutinePrivNotBetween(String value1, String value2) {
            addCriterion("Alter_routine_priv not between", value1, value2, "alterRoutinePriv");
            return (Criteria) this;
        }

        public Criteria andCreateUserPrivIsNull() {
            addCriterion("Create_user_priv is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserPrivIsNotNull() {
            addCriterion("Create_user_priv is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserPrivEqualTo(String value) {
            addCriterion("Create_user_priv =", value, "createUserPriv");
            return (Criteria) this;
        }

        public Criteria andCreateUserPrivNotEqualTo(String value) {
            addCriterion("Create_user_priv <>", value, "createUserPriv");
            return (Criteria) this;
        }

        public Criteria andCreateUserPrivGreaterThan(String value) {
            addCriterion("Create_user_priv >", value, "createUserPriv");
            return (Criteria) this;
        }

        public Criteria andCreateUserPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Create_user_priv >=", value, "createUserPriv");
            return (Criteria) this;
        }

        public Criteria andCreateUserPrivLessThan(String value) {
            addCriterion("Create_user_priv <", value, "createUserPriv");
            return (Criteria) this;
        }

        public Criteria andCreateUserPrivLessThanOrEqualTo(String value) {
            addCriterion("Create_user_priv <=", value, "createUserPriv");
            return (Criteria) this;
        }

        public Criteria andCreateUserPrivLike(String value) {
            addCriterion("Create_user_priv like", value, "createUserPriv");
            return (Criteria) this;
        }

        public Criteria andCreateUserPrivNotLike(String value) {
            addCriterion("Create_user_priv not like", value, "createUserPriv");
            return (Criteria) this;
        }

        public Criteria andCreateUserPrivIn(List<String> values) {
            addCriterion("Create_user_priv in", values, "createUserPriv");
            return (Criteria) this;
        }

        public Criteria andCreateUserPrivNotIn(List<String> values) {
            addCriterion("Create_user_priv not in", values, "createUserPriv");
            return (Criteria) this;
        }

        public Criteria andCreateUserPrivBetween(String value1, String value2) {
            addCriterion("Create_user_priv between", value1, value2, "createUserPriv");
            return (Criteria) this;
        }

        public Criteria andCreateUserPrivNotBetween(String value1, String value2) {
            addCriterion("Create_user_priv not between", value1, value2, "createUserPriv");
            return (Criteria) this;
        }

        public Criteria andEventPrivIsNull() {
            addCriterion("Event_priv is null");
            return (Criteria) this;
        }

        public Criteria andEventPrivIsNotNull() {
            addCriterion("Event_priv is not null");
            return (Criteria) this;
        }

        public Criteria andEventPrivEqualTo(String value) {
            addCriterion("Event_priv =", value, "eventPriv");
            return (Criteria) this;
        }

        public Criteria andEventPrivNotEqualTo(String value) {
            addCriterion("Event_priv <>", value, "eventPriv");
            return (Criteria) this;
        }

        public Criteria andEventPrivGreaterThan(String value) {
            addCriterion("Event_priv >", value, "eventPriv");
            return (Criteria) this;
        }

        public Criteria andEventPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Event_priv >=", value, "eventPriv");
            return (Criteria) this;
        }

        public Criteria andEventPrivLessThan(String value) {
            addCriterion("Event_priv <", value, "eventPriv");
            return (Criteria) this;
        }

        public Criteria andEventPrivLessThanOrEqualTo(String value) {
            addCriterion("Event_priv <=", value, "eventPriv");
            return (Criteria) this;
        }

        public Criteria andEventPrivLike(String value) {
            addCriterion("Event_priv like", value, "eventPriv");
            return (Criteria) this;
        }

        public Criteria andEventPrivNotLike(String value) {
            addCriterion("Event_priv not like", value, "eventPriv");
            return (Criteria) this;
        }

        public Criteria andEventPrivIn(List<String> values) {
            addCriterion("Event_priv in", values, "eventPriv");
            return (Criteria) this;
        }

        public Criteria andEventPrivNotIn(List<String> values) {
            addCriterion("Event_priv not in", values, "eventPriv");
            return (Criteria) this;
        }

        public Criteria andEventPrivBetween(String value1, String value2) {
            addCriterion("Event_priv between", value1, value2, "eventPriv");
            return (Criteria) this;
        }

        public Criteria andEventPrivNotBetween(String value1, String value2) {
            addCriterion("Event_priv not between", value1, value2, "eventPriv");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivIsNull() {
            addCriterion("Trigger_priv is null");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivIsNotNull() {
            addCriterion("Trigger_priv is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivEqualTo(String value) {
            addCriterion("Trigger_priv =", value, "triggerPriv");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivNotEqualTo(String value) {
            addCriterion("Trigger_priv <>", value, "triggerPriv");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivGreaterThan(String value) {
            addCriterion("Trigger_priv >", value, "triggerPriv");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivGreaterThanOrEqualTo(String value) {
            addCriterion("Trigger_priv >=", value, "triggerPriv");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivLessThan(String value) {
            addCriterion("Trigger_priv <", value, "triggerPriv");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivLessThanOrEqualTo(String value) {
            addCriterion("Trigger_priv <=", value, "triggerPriv");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivLike(String value) {
            addCriterion("Trigger_priv like", value, "triggerPriv");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivNotLike(String value) {
            addCriterion("Trigger_priv not like", value, "triggerPriv");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivIn(List<String> values) {
            addCriterion("Trigger_priv in", values, "triggerPriv");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivNotIn(List<String> values) {
            addCriterion("Trigger_priv not in", values, "triggerPriv");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivBetween(String value1, String value2) {
            addCriterion("Trigger_priv between", value1, value2, "triggerPriv");
            return (Criteria) this;
        }

        public Criteria andTriggerPrivNotBetween(String value1, String value2) {
            addCriterion("Trigger_priv not between", value1, value2, "triggerPriv");
            return (Criteria) this;
        }

        public Criteria andCreateTablespacePrivIsNull() {
            addCriterion("Create_tablespace_priv is null");
            return (Criteria) this;
        }

        public Criteria andCreateTablespacePrivIsNotNull() {
            addCriterion("Create_tablespace_priv is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTablespacePrivEqualTo(String value) {
            addCriterion("Create_tablespace_priv =", value, "createTablespacePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTablespacePrivNotEqualTo(String value) {
            addCriterion("Create_tablespace_priv <>", value, "createTablespacePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTablespacePrivGreaterThan(String value) {
            addCriterion("Create_tablespace_priv >", value, "createTablespacePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTablespacePrivGreaterThanOrEqualTo(String value) {
            addCriterion("Create_tablespace_priv >=", value, "createTablespacePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTablespacePrivLessThan(String value) {
            addCriterion("Create_tablespace_priv <", value, "createTablespacePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTablespacePrivLessThanOrEqualTo(String value) {
            addCriterion("Create_tablespace_priv <=", value, "createTablespacePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTablespacePrivLike(String value) {
            addCriterion("Create_tablespace_priv like", value, "createTablespacePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTablespacePrivNotLike(String value) {
            addCriterion("Create_tablespace_priv not like", value, "createTablespacePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTablespacePrivIn(List<String> values) {
            addCriterion("Create_tablespace_priv in", values, "createTablespacePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTablespacePrivNotIn(List<String> values) {
            addCriterion("Create_tablespace_priv not in", values, "createTablespacePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTablespacePrivBetween(String value1, String value2) {
            addCriterion("Create_tablespace_priv between", value1, value2, "createTablespacePriv");
            return (Criteria) this;
        }

        public Criteria andCreateTablespacePrivNotBetween(String value1, String value2) {
            addCriterion("Create_tablespace_priv not between", value1, value2, "createTablespacePriv");
            return (Criteria) this;
        }

        public Criteria andSslTypeIsNull() {
            addCriterion("ssl_type is null");
            return (Criteria) this;
        }

        public Criteria andSslTypeIsNotNull() {
            addCriterion("ssl_type is not null");
            return (Criteria) this;
        }

        public Criteria andSslTypeEqualTo(String value) {
            addCriterion("ssl_type =", value, "sslType");
            return (Criteria) this;
        }

        public Criteria andSslTypeNotEqualTo(String value) {
            addCriterion("ssl_type <>", value, "sslType");
            return (Criteria) this;
        }

        public Criteria andSslTypeGreaterThan(String value) {
            addCriterion("ssl_type >", value, "sslType");
            return (Criteria) this;
        }

        public Criteria andSslTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ssl_type >=", value, "sslType");
            return (Criteria) this;
        }

        public Criteria andSslTypeLessThan(String value) {
            addCriterion("ssl_type <", value, "sslType");
            return (Criteria) this;
        }

        public Criteria andSslTypeLessThanOrEqualTo(String value) {
            addCriterion("ssl_type <=", value, "sslType");
            return (Criteria) this;
        }

        public Criteria andSslTypeLike(String value) {
            addCriterion("ssl_type like", value, "sslType");
            return (Criteria) this;
        }

        public Criteria andSslTypeNotLike(String value) {
            addCriterion("ssl_type not like", value, "sslType");
            return (Criteria) this;
        }

        public Criteria andSslTypeIn(List<String> values) {
            addCriterion("ssl_type in", values, "sslType");
            return (Criteria) this;
        }

        public Criteria andSslTypeNotIn(List<String> values) {
            addCriterion("ssl_type not in", values, "sslType");
            return (Criteria) this;
        }

        public Criteria andSslTypeBetween(String value1, String value2) {
            addCriterion("ssl_type between", value1, value2, "sslType");
            return (Criteria) this;
        }

        public Criteria andSslTypeNotBetween(String value1, String value2) {
            addCriterion("ssl_type not between", value1, value2, "sslType");
            return (Criteria) this;
        }

        public Criteria andMaxQuestionsIsNull() {
            addCriterion("max_questions is null");
            return (Criteria) this;
        }

        public Criteria andMaxQuestionsIsNotNull() {
            addCriterion("max_questions is not null");
            return (Criteria) this;
        }

        public Criteria andMaxQuestionsEqualTo(Integer value) {
            addCriterion("max_questions =", value, "maxQuestions");
            return (Criteria) this;
        }

        public Criteria andMaxQuestionsNotEqualTo(Integer value) {
            addCriterion("max_questions <>", value, "maxQuestions");
            return (Criteria) this;
        }

        public Criteria andMaxQuestionsGreaterThan(Integer value) {
            addCriterion("max_questions >", value, "maxQuestions");
            return (Criteria) this;
        }

        public Criteria andMaxQuestionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_questions >=", value, "maxQuestions");
            return (Criteria) this;
        }

        public Criteria andMaxQuestionsLessThan(Integer value) {
            addCriterion("max_questions <", value, "maxQuestions");
            return (Criteria) this;
        }

        public Criteria andMaxQuestionsLessThanOrEqualTo(Integer value) {
            addCriterion("max_questions <=", value, "maxQuestions");
            return (Criteria) this;
        }

        public Criteria andMaxQuestionsIn(List<Integer> values) {
            addCriterion("max_questions in", values, "maxQuestions");
            return (Criteria) this;
        }

        public Criteria andMaxQuestionsNotIn(List<Integer> values) {
            addCriterion("max_questions not in", values, "maxQuestions");
            return (Criteria) this;
        }

        public Criteria andMaxQuestionsBetween(Integer value1, Integer value2) {
            addCriterion("max_questions between", value1, value2, "maxQuestions");
            return (Criteria) this;
        }

        public Criteria andMaxQuestionsNotBetween(Integer value1, Integer value2) {
            addCriterion("max_questions not between", value1, value2, "maxQuestions");
            return (Criteria) this;
        }

        public Criteria andMaxUpdatesIsNull() {
            addCriterion("max_updates is null");
            return (Criteria) this;
        }

        public Criteria andMaxUpdatesIsNotNull() {
            addCriterion("max_updates is not null");
            return (Criteria) this;
        }

        public Criteria andMaxUpdatesEqualTo(Integer value) {
            addCriterion("max_updates =", value, "maxUpdates");
            return (Criteria) this;
        }

        public Criteria andMaxUpdatesNotEqualTo(Integer value) {
            addCriterion("max_updates <>", value, "maxUpdates");
            return (Criteria) this;
        }

        public Criteria andMaxUpdatesGreaterThan(Integer value) {
            addCriterion("max_updates >", value, "maxUpdates");
            return (Criteria) this;
        }

        public Criteria andMaxUpdatesGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_updates >=", value, "maxUpdates");
            return (Criteria) this;
        }

        public Criteria andMaxUpdatesLessThan(Integer value) {
            addCriterion("max_updates <", value, "maxUpdates");
            return (Criteria) this;
        }

        public Criteria andMaxUpdatesLessThanOrEqualTo(Integer value) {
            addCriterion("max_updates <=", value, "maxUpdates");
            return (Criteria) this;
        }

        public Criteria andMaxUpdatesIn(List<Integer> values) {
            addCriterion("max_updates in", values, "maxUpdates");
            return (Criteria) this;
        }

        public Criteria andMaxUpdatesNotIn(List<Integer> values) {
            addCriterion("max_updates not in", values, "maxUpdates");
            return (Criteria) this;
        }

        public Criteria andMaxUpdatesBetween(Integer value1, Integer value2) {
            addCriterion("max_updates between", value1, value2, "maxUpdates");
            return (Criteria) this;
        }

        public Criteria andMaxUpdatesNotBetween(Integer value1, Integer value2) {
            addCriterion("max_updates not between", value1, value2, "maxUpdates");
            return (Criteria) this;
        }

        public Criteria andMaxConnectionsIsNull() {
            addCriterion("max_connections is null");
            return (Criteria) this;
        }

        public Criteria andMaxConnectionsIsNotNull() {
            addCriterion("max_connections is not null");
            return (Criteria) this;
        }

        public Criteria andMaxConnectionsEqualTo(Integer value) {
            addCriterion("max_connections =", value, "maxConnections");
            return (Criteria) this;
        }

        public Criteria andMaxConnectionsNotEqualTo(Integer value) {
            addCriterion("max_connections <>", value, "maxConnections");
            return (Criteria) this;
        }

        public Criteria andMaxConnectionsGreaterThan(Integer value) {
            addCriterion("max_connections >", value, "maxConnections");
            return (Criteria) this;
        }

        public Criteria andMaxConnectionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_connections >=", value, "maxConnections");
            return (Criteria) this;
        }

        public Criteria andMaxConnectionsLessThan(Integer value) {
            addCriterion("max_connections <", value, "maxConnections");
            return (Criteria) this;
        }

        public Criteria andMaxConnectionsLessThanOrEqualTo(Integer value) {
            addCriterion("max_connections <=", value, "maxConnections");
            return (Criteria) this;
        }

        public Criteria andMaxConnectionsIn(List<Integer> values) {
            addCriterion("max_connections in", values, "maxConnections");
            return (Criteria) this;
        }

        public Criteria andMaxConnectionsNotIn(List<Integer> values) {
            addCriterion("max_connections not in", values, "maxConnections");
            return (Criteria) this;
        }

        public Criteria andMaxConnectionsBetween(Integer value1, Integer value2) {
            addCriterion("max_connections between", value1, value2, "maxConnections");
            return (Criteria) this;
        }

        public Criteria andMaxConnectionsNotBetween(Integer value1, Integer value2) {
            addCriterion("max_connections not between", value1, value2, "maxConnections");
            return (Criteria) this;
        }

        public Criteria andMaxUserConnectionsIsNull() {
            addCriterion("max_user_connections is null");
            return (Criteria) this;
        }

        public Criteria andMaxUserConnectionsIsNotNull() {
            addCriterion("max_user_connections is not null");
            return (Criteria) this;
        }

        public Criteria andMaxUserConnectionsEqualTo(Integer value) {
            addCriterion("max_user_connections =", value, "maxUserConnections");
            return (Criteria) this;
        }

        public Criteria andMaxUserConnectionsNotEqualTo(Integer value) {
            addCriterion("max_user_connections <>", value, "maxUserConnections");
            return (Criteria) this;
        }

        public Criteria andMaxUserConnectionsGreaterThan(Integer value) {
            addCriterion("max_user_connections >", value, "maxUserConnections");
            return (Criteria) this;
        }

        public Criteria andMaxUserConnectionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_user_connections >=", value, "maxUserConnections");
            return (Criteria) this;
        }

        public Criteria andMaxUserConnectionsLessThan(Integer value) {
            addCriterion("max_user_connections <", value, "maxUserConnections");
            return (Criteria) this;
        }

        public Criteria andMaxUserConnectionsLessThanOrEqualTo(Integer value) {
            addCriterion("max_user_connections <=", value, "maxUserConnections");
            return (Criteria) this;
        }

        public Criteria andMaxUserConnectionsIn(List<Integer> values) {
            addCriterion("max_user_connections in", values, "maxUserConnections");
            return (Criteria) this;
        }

        public Criteria andMaxUserConnectionsNotIn(List<Integer> values) {
            addCriterion("max_user_connections not in", values, "maxUserConnections");
            return (Criteria) this;
        }

        public Criteria andMaxUserConnectionsBetween(Integer value1, Integer value2) {
            addCriterion("max_user_connections between", value1, value2, "maxUserConnections");
            return (Criteria) this;
        }

        public Criteria andMaxUserConnectionsNotBetween(Integer value1, Integer value2) {
            addCriterion("max_user_connections not between", value1, value2, "maxUserConnections");
            return (Criteria) this;
        }

        public Criteria andPluginIsNull() {
            addCriterion("plugin is null");
            return (Criteria) this;
        }

        public Criteria andPluginIsNotNull() {
            addCriterion("plugin is not null");
            return (Criteria) this;
        }

        public Criteria andPluginEqualTo(String value) {
            addCriterion("plugin =", value, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginNotEqualTo(String value) {
            addCriterion("plugin <>", value, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginGreaterThan(String value) {
            addCriterion("plugin >", value, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginGreaterThanOrEqualTo(String value) {
            addCriterion("plugin >=", value, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginLessThan(String value) {
            addCriterion("plugin <", value, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginLessThanOrEqualTo(String value) {
            addCriterion("plugin <=", value, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginLike(String value) {
            addCriterion("plugin like", value, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginNotLike(String value) {
            addCriterion("plugin not like", value, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginIn(List<String> values) {
            addCriterion("plugin in", values, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginNotIn(List<String> values) {
            addCriterion("plugin not in", values, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginBetween(String value1, String value2) {
            addCriterion("plugin between", value1, value2, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginNotBetween(String value1, String value2) {
            addCriterion("plugin not between", value1, value2, "plugin");
            return (Criteria) this;
        }

        public Criteria andPasswordExpiredIsNull() {
            addCriterion("password_expired is null");
            return (Criteria) this;
        }

        public Criteria andPasswordExpiredIsNotNull() {
            addCriterion("password_expired is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordExpiredEqualTo(String value) {
            addCriterion("password_expired =", value, "passwordExpired");
            return (Criteria) this;
        }

        public Criteria andPasswordExpiredNotEqualTo(String value) {
            addCriterion("password_expired <>", value, "passwordExpired");
            return (Criteria) this;
        }

        public Criteria andPasswordExpiredGreaterThan(String value) {
            addCriterion("password_expired >", value, "passwordExpired");
            return (Criteria) this;
        }

        public Criteria andPasswordExpiredGreaterThanOrEqualTo(String value) {
            addCriterion("password_expired >=", value, "passwordExpired");
            return (Criteria) this;
        }

        public Criteria andPasswordExpiredLessThan(String value) {
            addCriterion("password_expired <", value, "passwordExpired");
            return (Criteria) this;
        }

        public Criteria andPasswordExpiredLessThanOrEqualTo(String value) {
            addCriterion("password_expired <=", value, "passwordExpired");
            return (Criteria) this;
        }

        public Criteria andPasswordExpiredLike(String value) {
            addCriterion("password_expired like", value, "passwordExpired");
            return (Criteria) this;
        }

        public Criteria andPasswordExpiredNotLike(String value) {
            addCriterion("password_expired not like", value, "passwordExpired");
            return (Criteria) this;
        }

        public Criteria andPasswordExpiredIn(List<String> values) {
            addCriterion("password_expired in", values, "passwordExpired");
            return (Criteria) this;
        }

        public Criteria andPasswordExpiredNotIn(List<String> values) {
            addCriterion("password_expired not in", values, "passwordExpired");
            return (Criteria) this;
        }

        public Criteria andPasswordExpiredBetween(String value1, String value2) {
            addCriterion("password_expired between", value1, value2, "passwordExpired");
            return (Criteria) this;
        }

        public Criteria andPasswordExpiredNotBetween(String value1, String value2) {
            addCriterion("password_expired not between", value1, value2, "passwordExpired");
            return (Criteria) this;
        }

        public Criteria andPasswordLastChangedIsNull() {
            addCriterion("password_last_changed is null");
            return (Criteria) this;
        }

        public Criteria andPasswordLastChangedIsNotNull() {
            addCriterion("password_last_changed is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordLastChangedEqualTo(Date value) {
            addCriterion("password_last_changed =", value, "passwordLastChanged");
            return (Criteria) this;
        }

        public Criteria andPasswordLastChangedNotEqualTo(Date value) {
            addCriterion("password_last_changed <>", value, "passwordLastChanged");
            return (Criteria) this;
        }

        public Criteria andPasswordLastChangedGreaterThan(Date value) {
            addCriterion("password_last_changed >", value, "passwordLastChanged");
            return (Criteria) this;
        }

        public Criteria andPasswordLastChangedGreaterThanOrEqualTo(Date value) {
            addCriterion("password_last_changed >=", value, "passwordLastChanged");
            return (Criteria) this;
        }

        public Criteria andPasswordLastChangedLessThan(Date value) {
            addCriterion("password_last_changed <", value, "passwordLastChanged");
            return (Criteria) this;
        }

        public Criteria andPasswordLastChangedLessThanOrEqualTo(Date value) {
            addCriterion("password_last_changed <=", value, "passwordLastChanged");
            return (Criteria) this;
        }

        public Criteria andPasswordLastChangedIn(List<Date> values) {
            addCriterion("password_last_changed in", values, "passwordLastChanged");
            return (Criteria) this;
        }

        public Criteria andPasswordLastChangedNotIn(List<Date> values) {
            addCriterion("password_last_changed not in", values, "passwordLastChanged");
            return (Criteria) this;
        }

        public Criteria andPasswordLastChangedBetween(Date value1, Date value2) {
            addCriterion("password_last_changed between", value1, value2, "passwordLastChanged");
            return (Criteria) this;
        }

        public Criteria andPasswordLastChangedNotBetween(Date value1, Date value2) {
            addCriterion("password_last_changed not between", value1, value2, "passwordLastChanged");
            return (Criteria) this;
        }

        public Criteria andPasswordLifetimeIsNull() {
            addCriterion("password_lifetime is null");
            return (Criteria) this;
        }

        public Criteria andPasswordLifetimeIsNotNull() {
            addCriterion("password_lifetime is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordLifetimeEqualTo(Short value) {
            addCriterion("password_lifetime =", value, "passwordLifetime");
            return (Criteria) this;
        }

        public Criteria andPasswordLifetimeNotEqualTo(Short value) {
            addCriterion("password_lifetime <>", value, "passwordLifetime");
            return (Criteria) this;
        }

        public Criteria andPasswordLifetimeGreaterThan(Short value) {
            addCriterion("password_lifetime >", value, "passwordLifetime");
            return (Criteria) this;
        }

        public Criteria andPasswordLifetimeGreaterThanOrEqualTo(Short value) {
            addCriterion("password_lifetime >=", value, "passwordLifetime");
            return (Criteria) this;
        }

        public Criteria andPasswordLifetimeLessThan(Short value) {
            addCriterion("password_lifetime <", value, "passwordLifetime");
            return (Criteria) this;
        }

        public Criteria andPasswordLifetimeLessThanOrEqualTo(Short value) {
            addCriterion("password_lifetime <=", value, "passwordLifetime");
            return (Criteria) this;
        }

        public Criteria andPasswordLifetimeIn(List<Short> values) {
            addCriterion("password_lifetime in", values, "passwordLifetime");
            return (Criteria) this;
        }

        public Criteria andPasswordLifetimeNotIn(List<Short> values) {
            addCriterion("password_lifetime not in", values, "passwordLifetime");
            return (Criteria) this;
        }

        public Criteria andPasswordLifetimeBetween(Short value1, Short value2) {
            addCriterion("password_lifetime between", value1, value2, "passwordLifetime");
            return (Criteria) this;
        }

        public Criteria andPasswordLifetimeNotBetween(Short value1, Short value2) {
            addCriterion("password_lifetime not between", value1, value2, "passwordLifetime");
            return (Criteria) this;
        }

        public Criteria andAccountLockedIsNull() {
            addCriterion("account_locked is null");
            return (Criteria) this;
        }

        public Criteria andAccountLockedIsNotNull() {
            addCriterion("account_locked is not null");
            return (Criteria) this;
        }

        public Criteria andAccountLockedEqualTo(String value) {
            addCriterion("account_locked =", value, "accountLocked");
            return (Criteria) this;
        }

        public Criteria andAccountLockedNotEqualTo(String value) {
            addCriterion("account_locked <>", value, "accountLocked");
            return (Criteria) this;
        }

        public Criteria andAccountLockedGreaterThan(String value) {
            addCriterion("account_locked >", value, "accountLocked");
            return (Criteria) this;
        }

        public Criteria andAccountLockedGreaterThanOrEqualTo(String value) {
            addCriterion("account_locked >=", value, "accountLocked");
            return (Criteria) this;
        }

        public Criteria andAccountLockedLessThan(String value) {
            addCriterion("account_locked <", value, "accountLocked");
            return (Criteria) this;
        }

        public Criteria andAccountLockedLessThanOrEqualTo(String value) {
            addCriterion("account_locked <=", value, "accountLocked");
            return (Criteria) this;
        }

        public Criteria andAccountLockedLike(String value) {
            addCriterion("account_locked like", value, "accountLocked");
            return (Criteria) this;
        }

        public Criteria andAccountLockedNotLike(String value) {
            addCriterion("account_locked not like", value, "accountLocked");
            return (Criteria) this;
        }

        public Criteria andAccountLockedIn(List<String> values) {
            addCriterion("account_locked in", values, "accountLocked");
            return (Criteria) this;
        }

        public Criteria andAccountLockedNotIn(List<String> values) {
            addCriterion("account_locked not in", values, "accountLocked");
            return (Criteria) this;
        }

        public Criteria andAccountLockedBetween(String value1, String value2) {
            addCriterion("account_locked between", value1, value2, "accountLocked");
            return (Criteria) this;
        }

        public Criteria andAccountLockedNotBetween(String value1, String value2) {
            addCriterion("account_locked not between", value1, value2, "accountLocked");
            return (Criteria) this;
        }

        public Criteria andCreateRolePrivIsNull() {
            addCriterion("Create_role_priv is null");
            return (Criteria) this;
        }

        public Criteria andCreateRolePrivIsNotNull() {
            addCriterion("Create_role_priv is not null");
            return (Criteria) this;
        }

        public Criteria andCreateRolePrivEqualTo(String value) {
            addCriterion("Create_role_priv =", value, "createRolePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRolePrivNotEqualTo(String value) {
            addCriterion("Create_role_priv <>", value, "createRolePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRolePrivGreaterThan(String value) {
            addCriterion("Create_role_priv >", value, "createRolePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRolePrivGreaterThanOrEqualTo(String value) {
            addCriterion("Create_role_priv >=", value, "createRolePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRolePrivLessThan(String value) {
            addCriterion("Create_role_priv <", value, "createRolePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRolePrivLessThanOrEqualTo(String value) {
            addCriterion("Create_role_priv <=", value, "createRolePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRolePrivLike(String value) {
            addCriterion("Create_role_priv like", value, "createRolePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRolePrivNotLike(String value) {
            addCriterion("Create_role_priv not like", value, "createRolePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRolePrivIn(List<String> values) {
            addCriterion("Create_role_priv in", values, "createRolePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRolePrivNotIn(List<String> values) {
            addCriterion("Create_role_priv not in", values, "createRolePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRolePrivBetween(String value1, String value2) {
            addCriterion("Create_role_priv between", value1, value2, "createRolePriv");
            return (Criteria) this;
        }

        public Criteria andCreateRolePrivNotBetween(String value1, String value2) {
            addCriterion("Create_role_priv not between", value1, value2, "createRolePriv");
            return (Criteria) this;
        }

        public Criteria andDropRolePrivIsNull() {
            addCriterion("Drop_role_priv is null");
            return (Criteria) this;
        }

        public Criteria andDropRolePrivIsNotNull() {
            addCriterion("Drop_role_priv is not null");
            return (Criteria) this;
        }

        public Criteria andDropRolePrivEqualTo(String value) {
            addCriterion("Drop_role_priv =", value, "dropRolePriv");
            return (Criteria) this;
        }

        public Criteria andDropRolePrivNotEqualTo(String value) {
            addCriterion("Drop_role_priv <>", value, "dropRolePriv");
            return (Criteria) this;
        }

        public Criteria andDropRolePrivGreaterThan(String value) {
            addCriterion("Drop_role_priv >", value, "dropRolePriv");
            return (Criteria) this;
        }

        public Criteria andDropRolePrivGreaterThanOrEqualTo(String value) {
            addCriterion("Drop_role_priv >=", value, "dropRolePriv");
            return (Criteria) this;
        }

        public Criteria andDropRolePrivLessThan(String value) {
            addCriterion("Drop_role_priv <", value, "dropRolePriv");
            return (Criteria) this;
        }

        public Criteria andDropRolePrivLessThanOrEqualTo(String value) {
            addCriterion("Drop_role_priv <=", value, "dropRolePriv");
            return (Criteria) this;
        }

        public Criteria andDropRolePrivLike(String value) {
            addCriterion("Drop_role_priv like", value, "dropRolePriv");
            return (Criteria) this;
        }

        public Criteria andDropRolePrivNotLike(String value) {
            addCriterion("Drop_role_priv not like", value, "dropRolePriv");
            return (Criteria) this;
        }

        public Criteria andDropRolePrivIn(List<String> values) {
            addCriterion("Drop_role_priv in", values, "dropRolePriv");
            return (Criteria) this;
        }

        public Criteria andDropRolePrivNotIn(List<String> values) {
            addCriterion("Drop_role_priv not in", values, "dropRolePriv");
            return (Criteria) this;
        }

        public Criteria andDropRolePrivBetween(String value1, String value2) {
            addCriterion("Drop_role_priv between", value1, value2, "dropRolePriv");
            return (Criteria) this;
        }

        public Criteria andDropRolePrivNotBetween(String value1, String value2) {
            addCriterion("Drop_role_priv not between", value1, value2, "dropRolePriv");
            return (Criteria) this;
        }

        public Criteria andPasswordReuseHistoryIsNull() {
            addCriterion("Password_reuse_history is null");
            return (Criteria) this;
        }

        public Criteria andPasswordReuseHistoryIsNotNull() {
            addCriterion("Password_reuse_history is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordReuseHistoryEqualTo(Short value) {
            addCriterion("Password_reuse_history =", value, "passwordReuseHistory");
            return (Criteria) this;
        }

        public Criteria andPasswordReuseHistoryNotEqualTo(Short value) {
            addCriterion("Password_reuse_history <>", value, "passwordReuseHistory");
            return (Criteria) this;
        }

        public Criteria andPasswordReuseHistoryGreaterThan(Short value) {
            addCriterion("Password_reuse_history >", value, "passwordReuseHistory");
            return (Criteria) this;
        }

        public Criteria andPasswordReuseHistoryGreaterThanOrEqualTo(Short value) {
            addCriterion("Password_reuse_history >=", value, "passwordReuseHistory");
            return (Criteria) this;
        }

        public Criteria andPasswordReuseHistoryLessThan(Short value) {
            addCriterion("Password_reuse_history <", value, "passwordReuseHistory");
            return (Criteria) this;
        }

        public Criteria andPasswordReuseHistoryLessThanOrEqualTo(Short value) {
            addCriterion("Password_reuse_history <=", value, "passwordReuseHistory");
            return (Criteria) this;
        }

        public Criteria andPasswordReuseHistoryIn(List<Short> values) {
            addCriterion("Password_reuse_history in", values, "passwordReuseHistory");
            return (Criteria) this;
        }

        public Criteria andPasswordReuseHistoryNotIn(List<Short> values) {
            addCriterion("Password_reuse_history not in", values, "passwordReuseHistory");
            return (Criteria) this;
        }

        public Criteria andPasswordReuseHistoryBetween(Short value1, Short value2) {
            addCriterion("Password_reuse_history between", value1, value2, "passwordReuseHistory");
            return (Criteria) this;
        }

        public Criteria andPasswordReuseHistoryNotBetween(Short value1, Short value2) {
            addCriterion("Password_reuse_history not between", value1, value2, "passwordReuseHistory");
            return (Criteria) this;
        }

        public Criteria andPasswordReuseTimeIsNull() {
            addCriterion("Password_reuse_time is null");
            return (Criteria) this;
        }

        public Criteria andPasswordReuseTimeIsNotNull() {
            addCriterion("Password_reuse_time is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordReuseTimeEqualTo(Short value) {
            addCriterion("Password_reuse_time =", value, "passwordReuseTime");
            return (Criteria) this;
        }

        public Criteria andPasswordReuseTimeNotEqualTo(Short value) {
            addCriterion("Password_reuse_time <>", value, "passwordReuseTime");
            return (Criteria) this;
        }

        public Criteria andPasswordReuseTimeGreaterThan(Short value) {
            addCriterion("Password_reuse_time >", value, "passwordReuseTime");
            return (Criteria) this;
        }

        public Criteria andPasswordReuseTimeGreaterThanOrEqualTo(Short value) {
            addCriterion("Password_reuse_time >=", value, "passwordReuseTime");
            return (Criteria) this;
        }

        public Criteria andPasswordReuseTimeLessThan(Short value) {
            addCriterion("Password_reuse_time <", value, "passwordReuseTime");
            return (Criteria) this;
        }

        public Criteria andPasswordReuseTimeLessThanOrEqualTo(Short value) {
            addCriterion("Password_reuse_time <=", value, "passwordReuseTime");
            return (Criteria) this;
        }

        public Criteria andPasswordReuseTimeIn(List<Short> values) {
            addCriterion("Password_reuse_time in", values, "passwordReuseTime");
            return (Criteria) this;
        }

        public Criteria andPasswordReuseTimeNotIn(List<Short> values) {
            addCriterion("Password_reuse_time not in", values, "passwordReuseTime");
            return (Criteria) this;
        }

        public Criteria andPasswordReuseTimeBetween(Short value1, Short value2) {
            addCriterion("Password_reuse_time between", value1, value2, "passwordReuseTime");
            return (Criteria) this;
        }

        public Criteria andPasswordReuseTimeNotBetween(Short value1, Short value2) {
            addCriterion("Password_reuse_time not between", value1, value2, "passwordReuseTime");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireCurrentIsNull() {
            addCriterion("Password_require_current is null");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireCurrentIsNotNull() {
            addCriterion("Password_require_current is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireCurrentEqualTo(String value) {
            addCriterion("Password_require_current =", value, "passwordRequireCurrent");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireCurrentNotEqualTo(String value) {
            addCriterion("Password_require_current <>", value, "passwordRequireCurrent");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireCurrentGreaterThan(String value) {
            addCriterion("Password_require_current >", value, "passwordRequireCurrent");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireCurrentGreaterThanOrEqualTo(String value) {
            addCriterion("Password_require_current >=", value, "passwordRequireCurrent");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireCurrentLessThan(String value) {
            addCriterion("Password_require_current <", value, "passwordRequireCurrent");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireCurrentLessThanOrEqualTo(String value) {
            addCriterion("Password_require_current <=", value, "passwordRequireCurrent");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireCurrentLike(String value) {
            addCriterion("Password_require_current like", value, "passwordRequireCurrent");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireCurrentNotLike(String value) {
            addCriterion("Password_require_current not like", value, "passwordRequireCurrent");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireCurrentIn(List<String> values) {
            addCriterion("Password_require_current in", values, "passwordRequireCurrent");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireCurrentNotIn(List<String> values) {
            addCriterion("Password_require_current not in", values, "passwordRequireCurrent");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireCurrentBetween(String value1, String value2) {
            addCriterion("Password_require_current between", value1, value2, "passwordRequireCurrent");
            return (Criteria) this;
        }

        public Criteria andPasswordRequireCurrentNotBetween(String value1, String value2) {
            addCriterion("Password_require_current not between", value1, value2, "passwordRequireCurrent");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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