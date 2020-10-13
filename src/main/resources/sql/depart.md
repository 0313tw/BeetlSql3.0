departToUser
===
* 通过部门id 关联查询 user

```sql
SELECT * 
FROM department AS d, sys_user AS u 
WHERE d.id = u.department_id
@if(!isEmpty(id)){
AND d.id=#id#
@}
```

findDepartToUser
===
* 分页查询部门id 关联查询 user #这里需要注意d.* 的用法是为了不让user中的重名字段值覆盖d中的字段值#
```sql
SELECT
@pageTag(){
    d.*
@}
FROM department AS d, sys_user AS u 
WHERE d.id = u.department_id
@if(!isEmpty(id)){
AND d.`id`=#id#
@}
@if(isNotEmpty(name)){
AND d.`name` LIKE #name#
@} 
```