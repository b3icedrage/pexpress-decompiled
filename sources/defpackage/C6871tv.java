package defpackage;

import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: tv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6871tv implements UR1.a {
    @Override // UR1.a
    @NotNull
    public final UR1<Object, Object> a(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.a(C5207m.g(type), TR1.class)) {
            return new Cm2();
        }
        throw new IllegalArgumentException(type + " is not supported.");
    }
}
