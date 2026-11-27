package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: rv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6451rv implements InterfaceC6793tZ0.a {
    @Override // defpackage.InterfaceC6793tZ0.a
    @NotNull
    public final InterfaceC6793tZ0<?> a(@NotNull Type type, @NotNull Annotation[] annotations) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Class clsG = C5207m.g(type);
        if (Intrinsics.a(clsG, String.class)) {
            return new C2963bY1();
        }
        if (Intrinsics.a(clsG, byte[].class)) {
            return new C2111Tv();
        }
        throw new IllegalArgumentException("Type is not supported by this MessageAdapterFactory: " + type);
    }
}
