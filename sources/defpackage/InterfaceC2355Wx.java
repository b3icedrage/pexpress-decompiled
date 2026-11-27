package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Wx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2355Wx<M extends Member> {

    /* JADX INFO: renamed from: Wx$a */
    public static final class a {
        public static <M extends Member> void a(@NotNull InterfaceC2355Wx<? extends M> interfaceC2355Wx, @NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            if (N7.g(interfaceC2355Wx) == args.length) {
                return;
            }
            StringBuilder sb = new StringBuilder("Callable expects ");
            sb.append(N7.g(interfaceC2355Wx));
            sb.append(" arguments, but ");
            throw new IllegalArgumentException(SK.b(sb, args.length, " were provided."));
        }
    }

    @Nullable
    Object a(@NotNull Object[] objArr);

    @NotNull
    List<Type> b();

    M c();

    @NotNull
    Type n();
}
