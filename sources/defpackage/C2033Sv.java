package defpackage;

import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: Sv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2033Sv<Data> implements I01<byte[], Data> {
    public final b<Data> a;

    /* JADX INFO: renamed from: Sv$a */
    public static class a implements J01<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: Sv$a$a, reason: collision with other inner class name */
        public class C0146a implements b<ByteBuffer> {
            @Override // defpackage.C2033Sv.b
            public final Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // defpackage.C2033Sv.b
            public final ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // defpackage.J01
        @NonNull
        public final I01<byte[], ByteBuffer> d(@NonNull J11 j11) {
            return new C2033Sv(new C0146a());
        }
    }

    /* JADX INFO: renamed from: Sv$b */
    public interface b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* JADX INFO: renamed from: Sv$d */
    public static class d implements J01<byte[], InputStream> {

        /* JADX INFO: renamed from: Sv$d$a */
        public class a implements b<InputStream> {
            @Override // defpackage.C2033Sv.b
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // defpackage.C2033Sv.b
            public final InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // defpackage.J01
        @NonNull
        public final I01<byte[], InputStream> d(@NonNull J11 j11) {
            return new C2033Sv(new a());
        }
    }

    public C2033Sv(b<Data> bVar) {
        this.a = bVar;
    }

    @Override // defpackage.I01
    public final /* bridge */ /* synthetic */ boolean a(@NonNull byte[] bArr) {
        return true;
    }

    @Override // defpackage.I01
    public final I01.a b(@NonNull byte[] bArr, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        byte[] bArr2 = bArr;
        return new I01.a(new M71(bArr2), new c(bArr2, this.a));
    }

    /* JADX INFO: renamed from: Sv$c */
    public static class c<Data> implements InterfaceC6771tS<Data> {
        public final byte[] d;
        public final b<Data> e;

        public c(byte[] bArr, b<Data> bVar) {
            this.d = bArr;
            this.e = bVar;
        }

        @Override // defpackage.InterfaceC6771tS
        @NonNull
        public final Class<Data> a() {
            return this.e.a();
        }

        @Override // defpackage.InterfaceC6771tS
        public final void c(@NonNull EnumC7035uh1 enumC7035uh1, @NonNull InterfaceC6771tS.a<? super Data> aVar) {
            aVar.f(this.e.b(this.d));
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
