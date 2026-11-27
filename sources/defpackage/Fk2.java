package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Fk2 extends CK1 {
    @Override // defpackage.CK1
    public final String c() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
}
