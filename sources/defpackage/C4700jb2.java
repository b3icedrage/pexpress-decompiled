package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: jb2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4700jb2<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ TA d;

    public C4700jb2(TA ta) {
        this.d = ta;
    }

    @Override // defpackage.InterfaceC6606sf0
    public final Object a(Object obj, JM jm) {
        String str = (String) obj;
        if (str == null) {
            str = "";
        }
        this.d.a(str);
        return Unit.a;
    }
}
