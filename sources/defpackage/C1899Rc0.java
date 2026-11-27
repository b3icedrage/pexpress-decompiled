package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: Rc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1899Rc0<Data> implements I01<File, Data> {
    public final d<Data> a;

    /* JADX INFO: renamed from: Rc0$a */
    public static class a<Data> implements J01<File, Data> {
        public final d<Data> a;

        public a(d<Data> dVar) {
            this.a = dVar;
        }

        @Override // defpackage.J01
        @NonNull
        public final I01<File, Data> d(@NonNull J11 j11) {
            return new C1899Rc0(this.a);
        }
    }

    /* JADX INFO: renamed from: Rc0$b */
    public static class b extends a<ParcelFileDescriptor> {
    }

    /* JADX INFO: renamed from: Rc0$d */
    public interface d<Data> {
        Class<Data> a();

        void b(Data data);

        Data c(File file);
    }

    /* JADX INFO: renamed from: Rc0$e */
    public static class e extends a<InputStream> {
    }

    public C1899Rc0(d<Data> dVar) {
        this.a = dVar;
    }

    @Override // defpackage.I01
    public final /* bridge */ /* synthetic */ boolean a(@NonNull File file) {
        return true;
    }

    @Override // defpackage.I01
    public final I01.a b(@NonNull File file, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        File file2 = file;
        return new I01.a(new M71(file2), new c(file2, this.a));
    }

    /* JADX INFO: renamed from: Rc0$c */
    public static final class c<Data> implements InterfaceC6771tS<Data> {
        public final File d;
        public final d<Data> e;
        public Data g;

        public c(File file, d<Data> dVar) {
            this.d = file;
            this.e = dVar;
        }

        @Override // defpackage.InterfaceC6771tS
        @NonNull
        public final Class<Data> a() {
            return this.e.a();
        }

        @Override // defpackage.InterfaceC6771tS
        public final void b() {
            Data data = this.g;
            if (data != null) {
                try {
                    this.e.b(data);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // defpackage.InterfaceC6771tS
        public final void c(@NonNull EnumC7035uh1 enumC7035uh1, @NonNull InterfaceC6771tS.a<? super Data> aVar) {
            try {
                Data dataC = this.e.c(this.d);
                this.g = dataC;
                aVar.f(dataC);
            } catch (FileNotFoundException e) {
                Log.isLoggable("FileLoader", 3);
                aVar.d(e);
            }
        }

        @Override // defpackage.InterfaceC6771tS
        @NonNull
        public final CS e() {
            return CS.d;
        }

        @Override // defpackage.InterfaceC6771tS
        public final void cancel() {
        }
    }
}
