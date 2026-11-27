package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: hj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4261hj extends ArrayList<InterfaceC4812k62> implements InterfaceC4602j62 {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof InterfaceC4812k62) {
            return super.contains((InterfaceC4812k62) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof InterfaceC4812k62) {
            return super.indexOf((InterfaceC4812k62) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof InterfaceC4812k62) {
            return super.lastIndexOf((InterfaceC4812k62) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof InterfaceC4812k62) {
            return super.remove((InterfaceC4812k62) obj);
        }
        return false;
    }
}
