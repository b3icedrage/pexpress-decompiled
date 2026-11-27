package defpackage;

import android.util.Log;
import androidx.annotation.NonNull;
import io.sentry.instrumentation.file.j;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class YK0 implements InterfaceC1649Nx, E60, InterfaceC0748Cj0 {
    public Object d;

    public /* synthetic */ YK0(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.InterfaceC1649Nx
    public void a(@NotNull InterfaceC1101Gx call, @NotNull C0935Et1 c0935Et1) {
        Intrinsics.d(call, "call");
        C1717Ot1.a aVar = C1717Ot1.e;
        ((C6251qy) this.d).resumeWith(c0935Et1);
    }

    @Override // defpackage.InterfaceC0748Cj0
    public /* synthetic */ Object apply(Object obj) {
        return ((C6114qI1) this.d).invoke(obj);
    }

    @Override // defpackage.InterfaceC1649Nx
    public void b(@NotNull InterfaceC1101Gx call, @NotNull Throwable th) {
        Intrinsics.d(call, "call");
        C1717Ot1.a aVar = C1717Ot1.e;
        ((C6251qy) this.d).resumeWith(C1795Pt1.a(th));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.E60
    public boolean f(@NonNull Object obj, @NonNull File file, @NonNull C4227ha1 c4227ha1) {
        InputStream inputStream = (InputStream) obj;
        OU0 ou0 = (OU0) this.d;
        byte[] bArr = (byte[]) ou0.d(65536, byte[].class);
        FileOutputStream fileOutputStreamB = null;
        try {
            try {
                fileOutputStreamB = j.a.b(new FileOutputStream(file), file);
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    fileOutputStreamB.write(bArr, 0, i);
                    if (fileOutputStreamB != null) {
                        try {
                            fileOutputStreamB.close();
                        } catch (IOException unused) {
                        }
                    }
                    ou0.h(bArr);
                    throw th;
                }
                fileOutputStreamB.close();
                try {
                    fileOutputStreamB.close();
                } catch (IOException unused2) {
                }
                ou0.h(bArr);
                return true;
            } catch (IOException unused3) {
                Log.isLoggable("StreamEncoder", 3);
                if (fileOutputStreamB != null) {
                    try {
                        fileOutputStreamB.close();
                    } catch (IOException unused4) {
                    }
                }
                ou0.h(bArr);
                return false;
            }
        } catch (Throwable th) {
            if (fileOutputStreamB != null) {
                fileOutputStreamB.close();
            }
            ou0.h(bArr);
            throw th;
        }
    }
}
