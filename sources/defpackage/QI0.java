package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class QI0 {
    public static final boolean a(@NotNull JI0<?> ji0) {
        InterfaceC2355Wx<?> interfaceC2355WxI;
        InterfaceC2355Wx<?> interfaceC2355WxM;
        Intrinsics.checkNotNullParameter(ji0, "<this>");
        if (ji0 instanceof InterfaceC7586xJ0) {
            IJ0 ij0 = (IJ0) ji0;
            Field fieldA = C1546Mp1.a(ij0);
            if (!(fieldA != null ? fieldA.isAccessible() : true)) {
                return false;
            }
            Intrinsics.checkNotNullParameter(ij0, "<this>");
            Method methodB = C1546Mp1.b(ij0.f());
            if (!(methodB != null ? methodB.isAccessible() : true)) {
                return false;
            }
            InterfaceC7586xJ0 interfaceC7586xJ0 = (InterfaceC7586xJ0) ji0;
            Intrinsics.checkNotNullParameter(interfaceC7586xJ0, "<this>");
            Method methodB2 = C1546Mp1.b(interfaceC7586xJ0.g());
            if (!(methodB2 != null ? methodB2.isAccessible() : true)) {
                return false;
            }
        } else if (ji0 instanceof IJ0) {
            IJ0 ij1 = (IJ0) ji0;
            Field fieldA2 = C1546Mp1.a(ij1);
            if (!(fieldA2 != null ? fieldA2.isAccessible() : true)) {
                return false;
            }
            Intrinsics.checkNotNullParameter(ij1, "<this>");
            Method methodB3 = C1546Mp1.b(ij1.f());
            if (!(methodB3 != null ? methodB3.isAccessible() : true)) {
                return false;
            }
        } else if (ji0 instanceof IJ0.b) {
            Field fieldA3 = C1546Mp1.a(((IJ0.b) ji0).e());
            if (!(fieldA3 != null ? fieldA3.isAccessible() : true)) {
                return false;
            }
            Method methodB4 = C1546Mp1.b((InterfaceC6325rJ0) ji0);
            if (!(methodB4 != null ? methodB4.isAccessible() : true)) {
                return false;
            }
        } else if (ji0 instanceof InterfaceC7586xJ0.a) {
            Field fieldA4 = C1546Mp1.a(((InterfaceC7586xJ0.a) ji0).e());
            if (!(fieldA4 != null ? fieldA4.isAccessible() : true)) {
                return false;
            }
            Method methodB5 = C1546Mp1.b((InterfaceC6325rJ0) ji0);
            if (!(methodB5 != null ? methodB5.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(ji0 instanceof InterfaceC6325rJ0)) {
                throw new UnsupportedOperationException("Unknown callable: " + ji0 + " (" + ji0.getClass() + ')');
            }
            InterfaceC6325rJ0 interfaceC6325rJ0 = (InterfaceC6325rJ0) ji0;
            Method methodB6 = C1546Mp1.b(interfaceC6325rJ0);
            if (!(methodB6 != null ? methodB6.isAccessible() : true)) {
                return false;
            }
            PI0 pi0A = C7437wc2.a(ji0);
            Object objC = (pi0A == null || (interfaceC2355WxM = pi0A.m()) == null) ? null : interfaceC2355WxM.c();
            AccessibleObject accessibleObject = objC instanceof AccessibleObject ? (AccessibleObject) objC : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            Intrinsics.checkNotNullParameter(interfaceC6325rJ0, "<this>");
            PI0 pi0A2 = C7437wc2.a(interfaceC6325rJ0);
            Member memberC = (pi0A2 == null || (interfaceC2355WxI = pi0A2.i()) == null) ? null : interfaceC2355WxI.c();
            Constructor constructor = memberC instanceof Constructor ? (Constructor) memberC : null;
            if (!(constructor != null ? constructor.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }
}
