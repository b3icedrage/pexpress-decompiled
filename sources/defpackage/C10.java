package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class C10<DataT> implements I01<Integer, DataT> {
    public final Context a;
    public final Object b;

    public static final class a implements J01<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // C10.e
        public final Class<AssetFileDescriptor> a() {
            return AssetFileDescriptor.class;
        }

        @Override // C10.e
        public final void b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // C10.e
        public final Object c(Resources resources, int i, Resources.Theme theme) {
            return resources.openRawResourceFd(i);
        }

        @Override // defpackage.J01
        @NonNull
        public final I01<Integer, AssetFileDescriptor> d(@NonNull J11 j11) {
            return new C10(this.a, this);
        }
    }

    public static final class b implements J01<Integer, Drawable>, e<Drawable> {
        public final Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // C10.e
        public final Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // C10.e
        public final /* bridge */ /* synthetic */ void b(Drawable drawable) {
        }

        @Override // C10.e
        public final Object c(Resources resources, int i, Resources.Theme theme) {
            Context context = this.a;
            return D30.a(context, context, i, theme);
        }

        @Override // defpackage.J01
        @NonNull
        public final I01<Integer, Drawable> d(@NonNull J11 j11) {
            return new C10(this.a, this);
        }
    }

    public static final class c implements J01<Integer, InputStream>, e<InputStream> {
        public final Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override // C10.e
        public final Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // C10.e
        public final void b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // C10.e
        public final Object c(Resources resources, int i, Resources.Theme theme) {
            return resources.openRawResource(i);
        }

        @Override // defpackage.J01
        @NonNull
        public final I01<Integer, InputStream> d(@NonNull J11 j11) {
            return new C10(this.a, this);
        }
    }

    public interface e<DataT> {
        Class<DataT> a();

        void b(DataT datat);

        Object c(Resources resources, int i, Resources.Theme theme);
    }

    public C10(Context context, e<DataT> eVar) {
        this.a = context.getApplicationContext();
        this.b = eVar;
    }

    @Override // defpackage.I01
    public final /* bridge */ /* synthetic */ boolean a(@NonNull Integer num) {
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [C10$e, java.lang.Object] */
    @Override // defpackage.I01
    public final I01.a b(@NonNull Integer num, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        Integer num2 = num;
        Resources.Theme theme = (Resources.Theme) c4227ha1.c(C5185lt1.b);
        return new I01.a(new M71(num2), new d(theme, theme != null ? theme.getResources() : this.a.getResources(), this.b, num2.intValue()));
    }

    public static final class d<DataT> implements InterfaceC6771tS<DataT> {
        public final Resources.Theme d;
        public final Resources e;
        public final Object g;
        public final int h;
        public DataT i;

        public d(Resources.Theme theme, Resources resources, e<DataT> eVar, int i) {
            this.d = theme;
            this.e = resources;
            this.g = eVar;
            this.h = i;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [C10$e, java.lang.Object] */
        @Override // defpackage.InterfaceC6771tS
        @NonNull
        public final Class<DataT> a() {
            return this.g.a();
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [C10$e, java.lang.Object] */
        @Override // defpackage.InterfaceC6771tS
        public final void b() {
            DataT datat = this.i;
            if (datat != null) {
                try {
                    this.g.b(datat);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [C10$e, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // defpackage.InterfaceC6771tS
        public final void c(@NonNull EnumC7035uh1 enumC7035uh1, @NonNull InterfaceC6771tS.a<? super DataT> aVar) {
            try {
                ?? r4 = (DataT) this.g.c(this.e, this.h, this.d);
                this.i = r4;
                aVar.f(r4);
            } catch (Resources.NotFoundException e) {
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
