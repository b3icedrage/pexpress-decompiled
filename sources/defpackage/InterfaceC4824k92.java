package defpackage;

import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: k92, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4824k92 {

    /* JADX INFO: renamed from: k92$a */
    public static final class a implements InterfaceC7031ug1<Set<? extends String>> {

        @NotNull
        public final AbstractC0662Bg1.a<Set<String>> a = C1052Gg1.e("UNSENT_TO_OUR_BACKEND_BET_IDS_FOR_DEMO_BALANCE");

        @Override // defpackage.InterfaceC7031ug1
        @NotNull
        public final AbstractC0662Bg1.a<Set<? extends String>> getKey() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: k92$b */
    public static final class b implements InterfaceC7031ug1<Set<? extends String>> {

        @NotNull
        public final AbstractC0662Bg1.a<Set<String>> a = C1052Gg1.e("UNSENT_TO_OUR_BACKEND_BET_IDS_FOR_REAL_BALANCE");

        @Override // defpackage.InterfaceC7031ug1
        @NotNull
        public final AbstractC0662Bg1.a<Set<? extends String>> getKey() {
            return this.a;
        }
    }

    @Nullable
    Object a(@NotNull Z7 z7, @NotNull V7 v7);

    @Nullable
    Object b(@NotNull X7 x7, @NotNull V7 v7);

    @NotNull
    C5877p92.a c();

    @Nullable
    Object d(@NotNull Y7 y7, @NotNull V7 v7);

    @Nullable
    Object e(@NotNull W7 w7, @NotNull V7 v7);

    @NotNull
    C5877p92.b f();
}
