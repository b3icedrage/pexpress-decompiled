package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ge1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC4033ge1 {

    /* JADX INFO: renamed from: ge1$a */
    public static final class a implements InterfaceC4033ge1 {

        @NotNull
        public static final a a = new a();

        @Override // defpackage.InterfaceC4033ge1
        public final boolean a(@NotNull FC classDescriptor, @NotNull C3059c00 functionDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return true;
        }
    }

    /* JADX INFO: renamed from: ge1$b */
    public static final class b implements InterfaceC4033ge1 {

        @NotNull
        public static final b a = new b();

        @Override // defpackage.InterfaceC4033ge1
        public final boolean a(@NotNull FC classDescriptor, @NotNull C3059c00 functionDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return !functionDescriptor.k().P(C4243he1.a);
        }
    }

    boolean a(@NotNull FC fc, @NotNull C3059c00 c3059c00);
}
