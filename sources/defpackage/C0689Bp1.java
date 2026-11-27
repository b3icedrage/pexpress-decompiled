package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Bp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0689Bp1 extends AbstractC0845Dp1 implements InterfaceC6520sE0 {

    @NotNull
    public final Field a;

    public C0689Bp1(@NotNull Field member) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.a = member;
    }

    @Override // defpackage.InterfaceC6520sE0
    public final boolean G() {
        return this.a.isEnumConstant();
    }

    @Override // defpackage.AbstractC0845Dp1
    public final Member O() {
        return this.a;
    }

    @Override // defpackage.InterfaceC6520sE0
    public final TE0 getType() {
        Type type = this.a.getGenericType();
        Intrinsics.checkNotNullExpressionValue(type, "getGenericType(...)");
        Intrinsics.checkNotNullParameter(type, "type");
        boolean z = type instanceof Class;
        if (z) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                return new C1079Gp1(cls);
            }
        }
        if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
            return new C5806op1(type);
        }
        return type instanceof WildcardType ? new C1469Lp1((WildcardType) type) : new C7696xp1(type);
    }
}
