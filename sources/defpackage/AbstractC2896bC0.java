package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2896bC0 implements InterfaceC2355Wx<Method> {

    @NotNull
    public final Method a;

    @NotNull
    public final List<Type> b;

    @NotNull
    public final Class c;

    /* JADX INFO: renamed from: bC0$a */
    public static final class a extends AbstractC2896bC0 implements InterfaceC7919yu {

        @Nullable
        public final Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Method unboxMethod, @Nullable Object obj) {
            super(unboxMethod, C5653o60.d);
            Intrinsics.checkNotNullParameter(unboxMethod, "unboxMethod");
            this.d = obj;
        }

        @Override // defpackage.InterfaceC2355Wx
        @Nullable
        public final Object a(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            InterfaceC2355Wx.a.a(this, args);
            Intrinsics.checkNotNullParameter(args, "args");
            return this.a.invoke(this.d, Arrays.copyOf(args, args.length));
        }
    }

    /* JADX INFO: renamed from: bC0$b */
    public static final class b extends AbstractC2896bC0 {
        @Override // defpackage.InterfaceC2355Wx
        @Nullable
        public final Object a(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            InterfaceC2355Wx.a.a(this, args);
            Object obj = args[0];
            Object[] args2 = args.length <= 1 ? new Object[0] : C1371Kj.e(args, 1, args.length);
            Intrinsics.checkNotNullParameter(args2, "args");
            return this.a.invoke(obj, Arrays.copyOf(args2, args2.length));
        }
    }

    public AbstractC2896bC0(Method method, List list) {
        this.a = method;
        this.b = list;
        Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        this.c = returnType;
    }

    @Override // defpackage.InterfaceC2355Wx
    @NotNull
    public final List<Type> b() {
        return this.b;
    }

    @Override // defpackage.InterfaceC2355Wx
    public final /* bridge */ /* synthetic */ Member c() {
        return null;
    }

    @Override // defpackage.InterfaceC2355Wx
    @NotNull
    public final Type n() {
        return this.c;
    }
}
