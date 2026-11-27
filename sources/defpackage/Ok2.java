package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Ok2 extends CK1 {
    @Override // defpackage.CK1
    public final String c() {
        return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
    }
}
