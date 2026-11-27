package defpackage;

/* JADX INFO: renamed from: z41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7956z41 extends AbstractC4836kD1 {
    public static final FB1 b = new FB1("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);
    public final FB1 a = b;

    @Override // defpackage.AbstractC4836kD1
    public final AbstractC4836kD1.b a() {
        return new A41(this.a);
    }
}
