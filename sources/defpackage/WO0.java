package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class WO0 implements L62 {

    @NotNull
    public final LO0 a;

    @NotNull
    public final InterfaceC5095lU b;
    public final int c;

    @NotNull
    public final LinkedHashMap d;

    @NotNull
    public final VY0<ZE0, VO0> e;

    public WO0(@NotNull LO0 c, @NotNull InterfaceC5095lU containingDeclaration, @NotNull InterfaceC2681aF0 typeParameterOwner, int i) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
        this.a = c;
        this.b = containingDeclaration;
        this.c = i;
        ArrayList arrayListW = typeParameterOwner.w();
        Intrinsics.checkNotNullParameter(arrayListW, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayListW.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        this.d = linkedHashMap;
        this.e = this.a.a.a.f(new DK(this, 1));
    }

    @Override // defpackage.L62
    @Nullable
    public final H62 a(@NotNull ZE0 javaTypeParameter) {
        Intrinsics.checkNotNullParameter(javaTypeParameter, "javaTypeParameter");
        VO0 vo0Invoke = this.e.invoke(javaTypeParameter);
        return vo0Invoke != null ? vo0Invoke : this.a.b.a(javaTypeParameter);
    }
}
