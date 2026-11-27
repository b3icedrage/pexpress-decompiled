package defpackage;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: mw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5405mw implements I01<File, ByteBuffer> {

    /* JADX INFO: renamed from: mw$b */
    public static class b implements J01<File, ByteBuffer> {
        @Override // defpackage.J01
        @NonNull
        public final I01<File, ByteBuffer> d(@NonNull J11 j11) {
            return new C5405mw();
        }
    }

    @Override // defpackage.I01
    public final /* bridge */ /* synthetic */ boolean a(@NonNull File file) {
        return true;
    }

    @Override // defpackage.I01
    public final I01.a<ByteBuffer> b(@NonNull File file, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        File file2 = file;
        return new I01.a<>(new M71(file2), new a(file2));
    }

    /* JADX INFO: renamed from: mw$a */
    public static final class a implements InterfaceC6771tS<ByteBuffer> {
        public final File d;

        public a(File file) {
            this.d = file;
        }

        @Override // defpackage.InterfaceC6771tS
        @NonNull
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // defpackage.InterfaceC6771tS
        public final void c(@NonNull EnumC7035uh1 enumC7035uh1, @NonNull InterfaceC6771tS.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(C6035pw.a(this.d));
            } catch (IOException e) {
                Log.isLoggable("ByteBufferFileLoader", 3);
                aVar.d(e);
            }
        }

        @Override // defpackage.InterfaceC6771tS
        @NonNull
        public final CS e() {
            return CS.d;
        }

        @Override // defpackage.InterfaceC6771tS
        public final void b() {
        }

        @Override // defpackage.InterfaceC6771tS
        public final void cancel() {
        }
    }
}
