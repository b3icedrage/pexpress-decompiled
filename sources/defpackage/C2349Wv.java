package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Wv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2349Wv {

    @NotNull
    public static final a a = new a(UserVerificationMethods.USER_VERIFY_PATTERN);

    /* JADX INFO: renamed from: Wv$a */
    public static final class a extends GV<byte[]> {
        @Override // defpackage.GV
        public final byte[] l() {
            return new byte[4096];
        }
    }
}
