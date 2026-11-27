package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7486wp1 extends AbstractC5173lp1 implements InterfaceC3950gE0 {

    @NotNull
    public final Class<?> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7486wp1(@Nullable C5638o21 c5638o21, @NotNull Class<?> klass) {
        super(c5638o21);
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.b = klass;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC3950gE0
    @NotNull
    public final AbstractC1235Ip1 c() {
        Class<?> type = this.b;
        Intrinsics.checkNotNullParameter(type, "type");
        if (type.isPrimitive()) {
            return new C1079Gp1(type);
        }
        if ((type instanceof GenericArrayType) || type.isArray()) {
            return new C5806op1(type);
        }
        return type instanceof WildcardType ? new C1469Lp1((WildcardType) type) : new C7696xp1(type);
    }
}
