package defpackage;

import android.content.ContentValues;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ts0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC6863ts0 {

    /* JADX INFO: renamed from: ts0$a */
    public static final class a {
        public static /* synthetic */ void query$default(InterfaceC6863ts0 interfaceC6863ts0, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
            }
            if ((i & 2) != 0) {
                strArr = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                strArr2 = null;
            }
            if ((i & 16) != 0) {
                str3 = null;
            }
            if ((i & 32) != 0) {
                str4 = null;
            }
            if ((i & 64) != 0) {
                str5 = null;
            }
            if ((i & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str6 = null;
            }
            interfaceC6863ts0.query(str, strArr, str2, strArr2, str3, str4, str5, str6, function1);
        }
    }

    void delete(@NotNull String str, @Nullable String str2, @Nullable String[] strArr);

    void insert(@NotNull String str, @Nullable String str2, @Nullable ContentValues contentValues);

    void insertOrThrow(@NotNull String str, @Nullable String str2, @Nullable ContentValues contentValues);

    void query(@NotNull String str, @Nullable String[] strArr, @Nullable String str2, @Nullable String[] strArr2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @NotNull Function1<? super InterfaceC5604ns0, Unit> function1);

    int update(@NotNull String str, @NotNull ContentValues contentValues, @Nullable String str2, @Nullable String[] strArr);
}
