package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.example.fastcampus.part3.myapplication.DataBinderMapperImpl());
  }
}
