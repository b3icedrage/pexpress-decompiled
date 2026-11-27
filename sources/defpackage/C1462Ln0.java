package defpackage;

/* JADX INFO: renamed from: Ln0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1462Ln0 extends LQ0 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1462Ln0(MH1 mh1, int i) {
        super(mh1);
        this.b = i;
    }

    @Override // defpackage.MH1
    public final String a() {
        switch (this.b) {
            case 0:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
