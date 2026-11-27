package defpackage;

import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: su0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC6659su0 {

    /* JADX INFO: renamed from: su0$a */
    public static final class a {
        public static /* synthetic */ Boolean getBool$default(InterfaceC6659su0 interfaceC6659su0, String str, String str2, Boolean bool, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBool");
            }
            if ((i & 4) != 0) {
                bool = null;
            }
            return interfaceC6659su0.getBool(str, str2, bool);
        }

        public static /* synthetic */ Integer getInt$default(InterfaceC6659su0 interfaceC6659su0, String str, String str2, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInt");
            }
            if ((i & 4) != 0) {
                num = null;
            }
            return interfaceC6659su0.getInt(str, str2, num);
        }

        public static /* synthetic */ Long getLong$default(InterfaceC6659su0 interfaceC6659su0, String str, String str2, Long l, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
            }
            if ((i & 4) != 0) {
                l = null;
            }
            return interfaceC6659su0.getLong(str, str2, l);
        }

        public static /* synthetic */ String getString$default(InterfaceC6659su0 interfaceC6659su0, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return interfaceC6659su0.getString(str, str2, str3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Set getStringSet$default(InterfaceC6659su0 interfaceC6659su0, String str, String str2, Set set, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStringSet");
            }
            if ((i & 4) != 0) {
                set = null;
            }
            return interfaceC6659su0.getStringSet(str, str2, set);
        }
    }

    @Nullable
    Boolean getBool(@NotNull String str, @NotNull String str2, @Nullable Boolean bool);

    @Nullable
    Integer getInt(@NotNull String str, @NotNull String str2, @Nullable Integer num);

    @Nullable
    Long getLong(@NotNull String str, @NotNull String str2, @Nullable Long l);

    @Nullable
    String getString(@NotNull String str, @NotNull String str2, @Nullable String str3);

    @Nullable
    Set<String> getStringSet(@NotNull String str, @NotNull String str2, @Nullable Set<String> set);

    void saveBool(@NotNull String str, @NotNull String str2, @Nullable Boolean bool);

    void saveInt(@NotNull String str, @NotNull String str2, @Nullable Integer num);

    void saveLong(@NotNull String str, @NotNull String str2, @Nullable Long l);

    void saveString(@NotNull String str, @NotNull String str2, @Nullable String str3);

    void saveStringSet(@NotNull String str, @NotNull String str2, @Nullable Set<String> set);
}
