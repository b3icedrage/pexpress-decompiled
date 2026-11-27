package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4963kp1 extends AbstractC8116zp1 implements QD0 {

    @NotNull
    public final Annotation a;

    public C4963kp1(@NotNull Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        this.a = annotation;
    }

    @Override // defpackage.QD0
    public final C7065up1 D() {
        return new C7065up1(C7279vr.g(C7279vr.e(this.a)));
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C4963kp1) {
            return this.a == ((C4963kp1) obj).a;
        }
        return false;
    }

    @Override // defpackage.QD0
    @NotNull
    public final ArrayList f() throws IllegalAccessException, InvocationTargetException {
        Object c7486wp1;
        Annotation annotation = this.a;
        Method[] declaredMethods = C7279vr.g(C7279vr.e(annotation)).getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object value = method.invoke(annotation, new Object[0]);
            Intrinsics.checkNotNullExpressionValue(value, "invoke(...)");
            C5638o21 c5638o21K = C5638o21.k(method.getName());
            Intrinsics.checkNotNullParameter(value, "value");
            if (C4753jp1.e(value.getClass())) {
                c7486wp1 = new C0611Ap1(c5638o21K, (Enum) value);
            } else if (value instanceof Annotation) {
                c7486wp1 = new C5386mp1(c5638o21K, (Annotation) value);
            } else if (value instanceof Object[]) {
                c7486wp1 = new C5596np1(c5638o21K, (Object[]) value);
            } else {
                c7486wp1 = value instanceof Class ? new C7486wp1(c5638o21K, (Class) value) : new C0767Cp1(c5638o21K, value);
            }
            arrayList.add(c7486wp1);
        }
        return arrayList;
    }

    @Override // defpackage.QD0
    @NotNull
    public final QC h() {
        return C4753jp1.a(C7279vr.g(C7279vr.e(this.a)));
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    @NotNull
    public final String toString() {
        return C4963kp1.class.getName() + ": " + this.a;
    }
}
