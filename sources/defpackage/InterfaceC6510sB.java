package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC6510sB {

    /* JADX INFO: renamed from: sB$a */
    public static final class a {
        @Nullable
        public static String a(@NotNull InterfaceC6510sB interfaceC6510sB, @NotNull AE0 functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            if (interfaceC6510sB.a(functionDescriptor)) {
                return null;
            }
            return interfaceC6510sB.getDescription();
        }
    }

    boolean a(@NotNull AE0 ae0);

    @Nullable
    String b(@NotNull AE0 ae0);

    @NotNull
    String getDescription();
}
