package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: dp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3445dp1<ElementKlass, Element extends ElementKlass> extends RE<Element, Element[], ArrayList<Element>> {

    @NotNull
    public final RI0<ElementKlass> b;

    @NotNull
    public final C5992pj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3445dp1(@NotNull RI0<ElementKlass> kClass, @NotNull RJ0<Element> eSerializer) {
        super(eSerializer);
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.b = kClass;
        MH1 elementDesc = eSerializer.c();
        Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
        this.c = new C5992pj(elementDesc);
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return this.c;
    }

    @Override // defpackage.Z
    public final Object e() {
        return new ArrayList();
    }

    @Override // defpackage.Z
    public final int f(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // defpackage.Z
    public final Iterator g(Object obj) {
        Object[] objArr = (Object[]) obj;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return C6621sj.l(objArr);
    }

    @Override // defpackage.Z
    public final int h(Object obj) {
        Object[] objArr = (Object[]) obj;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return objArr.length;
    }

    @Override // defpackage.Z
    public final Object k(Object obj) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        C1371Kj.b(null);
        throw null;
    }

    @Override // defpackage.Z
    public final Object l(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        RI0<ElementKlass> eClass = this.b;
        Intrinsics.checkNotNullParameter(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) C7279vr.g(eClass), arrayList.size());
        Intrinsics.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
        return array;
    }

    @Override // defpackage.RE
    public final void m(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i, obj2);
    }
}
