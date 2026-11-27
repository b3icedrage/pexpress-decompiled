package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: lb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC5119lb1 {

    /* JADX INFO: renamed from: lb1$a */
    public static final class a implements InterfaceC5119lb1 {

        @NotNull
        public static final a a = new a();

        @Override // defpackage.InterfaceC5119lb1
        @NotNull
        public final C5653o60 a(@NotNull String packageFqName) {
            Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
            return C5653o60.d;
        }
    }

    @NotNull
    C5653o60 a(@NotNull String str);
}
