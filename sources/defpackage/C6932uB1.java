package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: uB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6932uB1 {
    public Fi2 a;
    public ArrayList<Fi2> b;

    public static long a(DX dx, long j) {
        Fi2 fi2 = dx.d;
        if (fi2 instanceof C6431ro0) {
            return j;
        }
        ArrayList arrayList = dx.k;
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC7206vX interfaceC7206vX = (InterfaceC7206vX) arrayList.get(i);
            if (interfaceC7206vX instanceof DX) {
                DX dx2 = (DX) interfaceC7206vX;
                if (dx2.d != fi2) {
                    jMin = Math.min(jMin, a(dx2, ((long) dx2.f) + j));
                }
            }
        }
        if (dx != fi2.i) {
            return jMin;
        }
        long j2 = fi2.j();
        DX dx3 = fi2.h;
        long j3 = j - j2;
        return Math.min(Math.min(jMin, a(dx3, j3)), j3 - ((long) dx3.f));
    }

    public static long b(DX dx, long j) {
        Fi2 fi2 = dx.d;
        if (fi2 instanceof C6431ro0) {
            return j;
        }
        ArrayList arrayList = dx.k;
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC7206vX interfaceC7206vX = (InterfaceC7206vX) arrayList.get(i);
            if (interfaceC7206vX instanceof DX) {
                DX dx2 = (DX) interfaceC7206vX;
                if (dx2.d != fi2) {
                    jMax = Math.max(jMax, b(dx2, ((long) dx2.f) + j));
                }
            }
        }
        if (dx != fi2.h) {
            return jMax;
        }
        long j2 = fi2.j();
        DX dx3 = fi2.i;
        long j3 = j + j2;
        return Math.max(Math.max(jMax, b(dx3, j3)), j3 - ((long) dx3.f));
    }
}
