package sktest.leon.persistence.biz;

import com.github.liaochong.myexcel.core.DefaultExcelBuilder;
import com.github.liaochong.myexcel.utils.FileExportUtil;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.shaneking.ling.test.SKUnit;
import org.shaneking.ling.zero.io.File0;
import org.shaneking.ling.zero.lang.String0;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EntityBizTest extends SKUnit {

  @Test
  void mge() {
  }

  @Test
  void add() {
  }

  @Test
  void rmv() {
  }

  @Test
  void del() {
  }

  @Test
  void mod() {
  }

  @Test
  void lst() {
  }

  @Test
  void one() {
  }

  @Test
  void csvAdd() {
  }

  @Test
  void csvMod() {
  }

  @Test
  void xlsxTmp() throws IOException {
    FileExportUtil.export(DefaultExcelBuilder.of(HelloExcelUserEntity.class).build(Lists.newArrayList(new HelloExcelUserEntity())), tstOFiles(File0.TYPE_XLSX));
    assertEquals(String0.ARY_DEC, String0.DIGITAL);
  }

  @Test
  void xlsxImp() {
  }

  @Test
  void xlsxExp() {
  }
}
