package com.JavaEmploymentTimes.Dao;

import com.JavaEmploymentTimes.Model.Epaperpost;

public interface IEpaperPostDao {
String AddEpaperPost(Epaperpost ePaperPost);
String UpdateEpaperPost(Epaperpost ePaperPost);
String DeleteEpaperPost();
}
