package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.HZ0;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Q0<MessageType extends HZ0> implements InterfaceC6176qc1<MessageType> {
    static {
        int i = C1578Na0.b;
    }

    public static void b(HZ0 hz0) throws C7144vC0 {
        C82 c82;
        if (hz0 == null || hz0.d()) {
            return;
        }
        if (hz0 instanceof H0) {
            c82 = new C82();
        } else {
            c82 = new C82();
        }
        C7144vC0 c7144vC0 = new C7144vC0(c82.getMessage());
        c7144vC0.d = hz0;
        throw c7144vC0;
    }

    public final HZ0 c(ByteArrayInputStream byteArrayInputStream, C1578Na0 c1578Na0) throws C7144vC0 {
        MessageType messagetype;
        try {
            int i = byteArrayInputStream.read();
            if (i == -1) {
                messagetype = null;
            } else {
                if ((i & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    i &= 127;
                    int i2 = 7;
                    while (true) {
                        if (i2 < 32) {
                            int i3 = byteArrayInputStream.read();
                            if (i3 == -1) {
                                throw C7144vC0.a();
                            }
                            i |= (i3 & 127) << i2;
                            if ((i3 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                                break;
                            }
                            i2 += 7;
                        } else {
                            while (true) {
                                if (i2 >= 64) {
                                    throw new C7144vC0("CodedInputStream encountered a malformed varint.");
                                }
                                int i4 = byteArrayInputStream.read();
                                if (i4 == -1) {
                                    throw C7144vC0.a();
                                }
                                if ((i4 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                                    break;
                                }
                                i2 += 7;
                            }
                        }
                    }
                }
                EE ee = new EE(new H0.a.C0041a(byteArrayInputStream, i));
                MessageType messagetypeA = a(ee, c1578Na0);
                try {
                    ee.a(0);
                    messagetype = messagetypeA;
                } catch (C7144vC0 e) {
                    e.d = messagetypeA;
                    throw e;
                }
            }
            b(messagetype);
            return messagetype;
        } catch (IOException e2) {
            throw new C7144vC0(e2.getMessage());
        }
    }
}
