package defpackage;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: pZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(19)
public final class C5954pZ0 implements InterfaceC0962Fc1, InterfaceC2163Um0 {
    public final Path a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final ArrayList d = new ArrayList();
    public final C5744oZ0 e;

    public C5954pZ0(C5744oZ0 c5744oZ0) {
        c5744oZ0.getClass();
        this.e = c5744oZ0;
    }

    @TargetApi(19)
    public final void a(Path.Op op) {
        Matrix matrixE;
        Matrix matrixE2;
        Path path = this.b;
        path.reset();
        Path path2 = this.a;
        path2.reset();
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            InterfaceC0962Fc1 interfaceC0962Fc1 = (InterfaceC0962Fc1) arrayList.get(size);
            if (interfaceC0962Fc1 instanceof ML) {
                ML ml = (ML) interfaceC0962Fc1;
                ArrayList arrayList2 = (ArrayList) ml.g();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path pathI = ((InterfaceC0962Fc1) arrayList2.get(size2)).i();
                    C6276r42 c6276r42 = ml.k;
                    if (c6276r42 != null) {
                        matrixE2 = c6276r42.e();
                    } else {
                        matrixE2 = ml.c;
                        matrixE2.reset();
                    }
                    pathI.transform(matrixE2);
                    path.addPath(pathI);
                }
            } else {
                path.addPath(interfaceC0962Fc1.i());
            }
        }
        int i = 0;
        InterfaceC0962Fc1 interfaceC0962Fc2 = (InterfaceC0962Fc1) arrayList.get(0);
        if (interfaceC0962Fc2 instanceof ML) {
            ML ml2 = (ML) interfaceC0962Fc2;
            List<InterfaceC0962Fc1> listG = ml2.g();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listG;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path pathI2 = ((InterfaceC0962Fc1) arrayList3.get(i)).i();
                C6276r42 c6276r43 = ml2.k;
                if (c6276r43 != null) {
                    matrixE = c6276r43.e();
                } else {
                    matrixE = ml2.c;
                    matrixE.reset();
                }
                pathI2.transform(matrixE);
                path2.addPath(pathI2);
                i++;
            }
        } else {
            path2.set(interfaceC0962Fc2.i());
        }
        this.c.op(path2, path, op);
    }

    @Override // defpackage.DL
    public final void b(List<DL> list, List<DL> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC0962Fc1) arrayList.get(i)).b(list, list2);
            i++;
        }
    }

    @Override // defpackage.InterfaceC2163Um0
    public final void g(ListIterator<DL> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            DL dlPrevious = listIterator.previous();
            if (dlPrevious instanceof InterfaceC0962Fc1) {
                this.d.add((InterfaceC0962Fc1) dlPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.InterfaceC0962Fc1
    public final Path i() {
        Path path = this.c;
        path.reset();
        C5744oZ0 c5744oZ0 = this.e;
        if (!c5744oZ0.b) {
            int iOrdinal = c5744oZ0.a.ordinal();
            if (iOrdinal == 0) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((InterfaceC0962Fc1) arrayList.get(i)).i());
                    i++;
                }
            } else {
                if (iOrdinal == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (iOrdinal == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (iOrdinal == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (iOrdinal == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
