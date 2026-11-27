package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Di2 extends TK {
    public ArrayList<TK> u0 = new ArrayList<>();

    @Override // defpackage.TK
    public void G() {
        this.u0.clear();
        super.G();
    }

    @Override // defpackage.TK
    public final void J(C3887fx c3887fx) {
        super.J(c3887fx);
        int size = this.u0.size();
        for (int i = 0; i < size; i++) {
            this.u0.get(i).J(c3887fx);
        }
    }

    public void V() {
        ArrayList<TK> arrayList = this.u0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TK tk = this.u0.get(i);
            if (tk instanceof Di2) {
                ((Di2) tk).V();
            }
        }
    }
}
