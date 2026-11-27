package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: renamed from: ul1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7051ul1<DataT> implements I01<Uri, DataT> {
    public final Context a;
    public final I01<File, DataT> b;
    public final I01<Uri, DataT> c;
    public final Class<DataT> d;

    /* JADX INFO: renamed from: ul1$a */
    public static abstract class a<DataT> implements J01<Uri, DataT> {
        public final Context a;
        public final Class<DataT> b;

        public a(Context context, Class<DataT> cls) {
            this.a = context;
            this.b = cls;
        }

        @Override // defpackage.J01
        @NonNull
        public final I01<Uri, DataT> d(@NonNull J11 j11) {
            Class<DataT> cls = this.b;
            return new C7051ul1(this.a, j11.a(File.class, cls), j11.a(Uri.class, cls), cls);
        }
    }

    /* JADX INFO: renamed from: ul1$b */
    public static final class b extends a<ParcelFileDescriptor> {
    }

    /* JADX INFO: renamed from: ul1$c */
    public static final class c extends a<InputStream> {
    }

    /* JADX INFO: renamed from: ul1$d */
    public static final class d<DataT> implements InterfaceC6771tS<DataT> {
        public static final String[] o = {"_data"};
        public final Context d;
        public final I01<File, DataT> e;
        public final I01<Uri, DataT> g;
        public final Uri h;
        public final int i;
        public final int j;
        public final C4227ha1 k;
        public final Class<DataT> l;
        public volatile boolean m;
        public volatile InterfaceC6771tS<DataT> n;

        public d(Context context, I01<File, DataT> i01, I01<Uri, DataT> i02, Uri uri, int i, int i2, C4227ha1 c4227ha1, Class<DataT> cls) {
            this.d = context.getApplicationContext();
            this.e = i01;
            this.g = i02;
            this.h = uri;
            this.i = i;
            this.j = i2;
            this.k = c4227ha1;
            this.l = cls;
        }

        @Override // defpackage.InterfaceC6771tS
        @NonNull
        public final Class<DataT> a() {
            return this.l;
        }

        @Override // defpackage.InterfaceC6771tS
        public final void b() {
            InterfaceC6771tS<DataT> interfaceC6771tS = this.n;
            if (interfaceC6771tS != null) {
                interfaceC6771tS.b();
            }
        }

        @Override // defpackage.InterfaceC6771tS
        public final void c(@NonNull EnumC7035uh1 enumC7035uh1, @NonNull InterfaceC6771tS.a<? super DataT> aVar) throws Throwable {
            try {
                InterfaceC6771tS<DataT> interfaceC6771tSD = d();
                if (interfaceC6771tSD == null) {
                    aVar.d(new IllegalArgumentException("Failed to build fetcher for: " + this.h));
                } else {
                    this.n = interfaceC6771tSD;
                    if (this.m) {
                        cancel();
                    } else {
                        interfaceC6771tSD.c(enumC7035uh1, aVar);
                    }
                }
            } catch (FileNotFoundException e) {
                aVar.d(e);
            }
        }

        @Override // defpackage.InterfaceC6771tS
        public final void cancel() {
            this.m = true;
            InterfaceC6771tS<DataT> interfaceC6771tS = this.n;
            if (interfaceC6771tS != null) {
                interfaceC6771tS.cancel();
            }
        }

        public final InterfaceC6771tS<DataT> d() throws Throwable {
            I01.a<DataT> aVarB;
            boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            C4227ha1 c4227ha1 = this.k;
            int i = this.j;
            int i2 = this.i;
            Context context = this.d;
            if (zIsExternalStorageLegacy) {
                Uri uri = this.h;
                try {
                    Cursor cursorQuery = context.getContentResolver().query(uri, o, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                aVarB = this.e.b(file, i2, i, c4227ha1);
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                int iCheckSelfPermission = context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION");
                Uri requireOriginal = this.h;
                if (iCheckSelfPermission == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                aVarB = this.g.b(requireOriginal, i2, i, c4227ha1);
            }
            if (aVarB != null) {
                return aVarB.c;
            }
            return null;
        }

        @Override // defpackage.InterfaceC6771tS
        @NonNull
        public final CS e() {
            return CS.d;
        }
    }

    public C7051ul1(Context context, I01<File, DataT> i01, I01<Uri, DataT> i02, Class<DataT> cls) {
        this.a = context.getApplicationContext();
        this.b = i01;
        this.c = i02;
        this.d = cls;
    }

    @Override // defpackage.I01
    public final boolean a(@NonNull Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && Nm2.g(uri);
    }

    @Override // defpackage.I01
    public final I01.a b(@NonNull Uri uri, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        Uri uri2 = uri;
        return new I01.a(new M71(uri2), new d(this.a, this.b, this.c, uri2, i, i2, c4227ha1, this.d));
    }
}
