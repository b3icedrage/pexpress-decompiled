package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: u70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6916u70 implements InterfaceC0697Bs0 {
    public static final Charset b = Charset.forName("UTF-8");

    @NotNull
    public final InterfaceC1560Mu0 a;

    public C6916u70(@NotNull InterfaceC1560Mu0 interfaceC1560Mu0) {
        this.a = interfaceC1560Mu0;
    }

    @Override // defpackage.InterfaceC0697Bs0
    @Nullable
    public final C3537eG1 a(@NotNull BufferedInputStream bufferedInputStream) throws IOException {
        InterfaceC1560Mu0 interfaceC1560Mu0 = this.a;
        Charset charset = b;
        byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        int i2 = -1;
        while (true) {
            try {
                int i3 = bufferedInputStream.read(bArr);
                if (i3 <= 0) {
                    break;
                }
                for (int i4 = 0; i2 == -1 && i4 < i3; i4++) {
                    if (bArr[i4] == 10) {
                        i2 = i + i4;
                        break;
                    }
                }
                byteArrayOutputStream.write(bArr, 0, i3);
                i += i3;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length == 0) {
            throw new IllegalArgumentException("Empty stream.");
        }
        if (i2 == -1) {
            throw new IllegalArgumentException("Envelope contains no header.");
        }
        StringReader stringReader = new StringReader(new String(byteArray, 0, i2, charset));
        try {
            C3747fG1 c3747fG1 = (C3747fG1) interfaceC1560Mu0.d(stringReader, C3747fG1.class);
            stringReader.close();
            if (c3747fG1 == null) {
                throw new IllegalArgumentException("Envelope header is null.");
            }
            int i5 = i2 + 1;
            ArrayList arrayList = new ArrayList();
            while (true) {
                int i6 = i5;
                while (true) {
                    if (i6 >= byteArray.length) {
                        i6 = -1;
                        break;
                    }
                    if (byteArray[i6] == 10) {
                        break;
                    }
                    i6++;
                }
                if (i6 == -1) {
                    throw new IllegalArgumentException("Invalid envelope. Item at index '" + arrayList.size() + "'. has no header delimiter.");
                }
                StringReader stringReader2 = new StringReader(new String(byteArray, i5, i6 - i5, charset));
                try {
                    DG1 dg1 = (DG1) interfaceC1560Mu0.d(stringReader2, DG1.class);
                    stringReader2.close();
                    if (dg1 == null || dg1.a() <= 0) {
                        throw new IllegalArgumentException("Item header at index '" + arrayList.size() + "' is null or empty.");
                    }
                    int iA = dg1.a() + i6;
                    int i7 = iA + 1;
                    if (i7 > byteArray.length) {
                        throw new IllegalArgumentException("Invalid length for item at index '" + arrayList.size() + "'. Item is '" + i7 + "' bytes. There are '" + byteArray.length + "' in the buffer.");
                    }
                    arrayList.add(new CG1(dg1, Arrays.copyOfRange(byteArray, i6 + 1, i7)));
                    if (i7 == byteArray.length) {
                        break;
                    }
                    i5 = iA + 2;
                    if (i5 == byteArray.length) {
                        if (byteArray[i7] == 10) {
                            break;
                        }
                        throw new IllegalArgumentException("Envelope has invalid data following an item.");
                    }
                } catch (Throwable th3) {
                    try {
                        stringReader2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            C3537eG1 c3537eG1 = new C3537eG1(c3747fG1, arrayList);
            byteArrayOutputStream.close();
            return c3537eG1;
        } catch (Throwable th5) {
            try {
                stringReader.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }
}
