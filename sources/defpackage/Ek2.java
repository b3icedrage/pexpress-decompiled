package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Ek2 extends CK1 {
    @Override // defpackage.CK1
    public final String c() {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }
}
