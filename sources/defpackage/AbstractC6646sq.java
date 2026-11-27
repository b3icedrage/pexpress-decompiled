package defpackage;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: sq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6646sq implements InterfaceC4023gc {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ AbstractC6646sq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public void a(InterfaceC0971Ff1 interfaceC0971Ff1) {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(interfaceC0971Ff1);
        }
    }

    @Override // defpackage.InterfaceC4023gc
    public boolean i() {
        List list = (List) this.b;
        return list.isEmpty() || (list.size() == 1 && ((C7589xK0) list.get(0)).c());
    }

    @Override // defpackage.InterfaceC4023gc
    public List k() {
        return (List) this.b;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.b;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public AbstractC6646sq() {
        this.a = 1;
        char[] cArr = C6177qc2.a;
        this.b = new ArrayDeque(20);
    }
}
