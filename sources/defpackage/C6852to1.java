package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: to1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6852to1 extends RU0<XY0, C6642so1.a> {
    public final /* synthetic */ C6642so1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6852to1(C6642so1 c6642so1, int i) {
        super(i);
        this.a = c6642so1;
    }

    @Override // defpackage.RU0
    public final void entryRemoved(boolean z, XY0 xy0, C6642so1.a aVar, C6642so1.a aVar2) {
        XY0 key = xy0;
        C6642so1.a oldValue = aVar;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        C6642so1 c6642so1 = this.a;
        if (c6642so1.g.b(oldValue.a)) {
            return;
        }
        c6642so1.e.d(key, oldValue.a, oldValue.b, oldValue.c);
    }

    @Override // defpackage.RU0
    public final int sizeOf(XY0 xy0, C6642so1.a aVar) {
        XY0 key = xy0;
        C6642so1.a value = aVar;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return value.c;
    }
}
