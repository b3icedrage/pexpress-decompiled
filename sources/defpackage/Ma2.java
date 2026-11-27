package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Ma2 implements InterfaceC2209Vb1 {

    @NotNull
    public final C2291Wb1 a;

    public Ma2(@NotNull C2291Wb1 encodedParametersBuilder) {
        Intrinsics.checkNotNullParameter(encodedParametersBuilder, "encodedParametersBuilder");
        this.a = encodedParametersBuilder;
    }

    @Override // defpackage.InterfaceC7614xS1
    @NotNull
    public final Set<Map.Entry<String, List<String>>> a() {
        return ((AS1) C0957Fb.l(this.a)).a();
    }

    @Override // defpackage.InterfaceC7614xS1
    public final void b(@NotNull String name, @NotNull List values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        String strF = BE.f(name, false);
        ArrayList arrayList = new ArrayList(XE.m(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Intrinsics.checkNotNullParameter(str, "<this>");
            arrayList.add(BE.f(str, true));
        }
        this.a.b(strF, arrayList);
    }

    @Override // defpackage.InterfaceC7614xS1
    @Nullable
    public final List<String> c(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List<String> listC = this.a.c(BE.f(name, false));
        if (listC == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(XE.m(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(BE.e((String) it.next(), 0, 0, 11));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC7614xS1
    @NotNull
    public final Set<String> names() {
        Set<String> setKeySet = this.a.a.keySet();
        ArrayList arrayList = new ArrayList(XE.m(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(BE.e((String) it.next(), 0, 0, 15));
        }
        return CollectionsKt.h0(arrayList);
    }
}
