package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class JD implements InterfaceC1608Nj0 {
    public final /* synthetic */ int d;

    public /* synthetic */ JD(int i) {
        this.d = i;
    }

    public static /* synthetic */ boolean a(int i) {
        if (i == 1 || i == 2) {
            return false;
        }
        if (i == 3 || i == 4) {
            return true;
        }
        throw null;
    }

    @Override // defpackage.InterfaceC1608Nj0
    public Object apply(Object obj) {
        switch (this.d) {
            case 0:
                TD td = (TD) obj;
                if (td != null) {
                    return td.a.e;
                }
                throw new IllegalArgumentException("There is unhandled type of client text message");
            default:
                SF0.b bVar = (SF0.b) obj;
                return Boolean.valueOf(bVar != null && bVar.a && bVar.b && !bVar.c);
        }
    }
}
