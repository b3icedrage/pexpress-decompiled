package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ZO1 implements InterfaceC5737oX {
    public final char a;
    public int b = 0;
    public final LinkedList<InterfaceC5737oX> c = new LinkedList<>();

    public ZO1(char c) {
        this.a = c;
    }

    @Override // defpackage.InterfaceC5737oX
    public final void a(RX1 rx1, RX1 rx2, int i) {
        LinkedList<InterfaceC5737oX> linkedList = this.c;
        for (InterfaceC5737oX first : linkedList) {
            if (first.c() <= i) {
                first.a(rx1, rx2, i);
            }
        }
        first = linkedList.getFirst();
        first.a(rx1, rx2, i);
    }

    @Override // defpackage.InterfaceC5737oX
    public final char b() {
        return this.a;
    }

    @Override // defpackage.InterfaceC5737oX
    public final int c() {
        return this.b;
    }

    @Override // defpackage.InterfaceC5737oX
    public final int d(C5527nX c5527nX, C5527nX c5527nX2) {
        InterfaceC5737oX first;
        int i = c5527nX.g;
        LinkedList<InterfaceC5737oX> linkedList = this.c;
        Iterator<InterfaceC5737oX> it = linkedList.iterator();
        while (it.hasNext()) {
            first = it.next();
            if (first.c() <= i) {
                return first.d(c5527nX, c5527nX2);
            }
        }
        first = linkedList.getFirst();
        return first.d(c5527nX, c5527nX2);
    }

    @Override // defpackage.InterfaceC5737oX
    public final char e() {
        return this.a;
    }

    public final void f(InterfaceC5737oX interfaceC5737oX) {
        int iC = interfaceC5737oX.c();
        LinkedList<InterfaceC5737oX> linkedList = this.c;
        ListIterator<InterfaceC5737oX> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int iC2 = listIterator.next().c();
            if (iC > iC2) {
                listIterator.previous();
                listIterator.add(interfaceC5737oX);
                return;
            } else if (iC == iC2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.a + "' and minimum length " + iC);
            }
        }
        linkedList.add(interfaceC5737oX);
        this.b = iC;
    }
}
