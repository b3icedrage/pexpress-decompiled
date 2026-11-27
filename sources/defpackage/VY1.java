package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class VY1 implements InterfaceC6771tS<InputStream> {
    public final Uri d;
    public final YY1 e;
    public InputStream g;

    public static class a implements WY1 {
        public static final String[] b = {"_data"};
        public final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // defpackage.WY1
        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    public static class b implements WY1 {
        public static final String[] b = {"_data"};
        public final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // defpackage.WY1
        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    public VY1(Uri uri, YY1 yy1) {
        this.d = uri;
        this.e = yy1;
    }

    public static VY1 d(Context context, Uri uri, WY1 wy1) {
        return new VY1(uri, new YY1(com.bumptech.glide.a.a(context).g.a().e(), wy1, com.bumptech.glide.a.a(context).h, context.getContentResolver()));
    }

    @Override // defpackage.InterfaceC6771tS
    @NonNull
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.InterfaceC6771tS
    public final void b() {
        InputStream inputStream = this.g;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.InterfaceC6771tS
    public final void c(@NonNull EnumC7035uh1 enumC7035uh1, @NonNull InterfaceC6771tS.a<? super InputStream> aVar) throws Throwable {
        try {
            InputStream inputStreamF = f();
            this.g = inputStreamF;
            aVar.f(inputStreamF);
        } catch (FileNotFoundException e) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
            aVar.d(e);
        }
    }

    @Override // defpackage.InterfaceC6771tS
    @NonNull
    public final CS e() {
        return CS.d;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public final InputStream f() throws Throwable {
        Cursor cursorA;
        String string;
        boolean zIsEmpty;
        ContentResolver contentResolver;
        File file;
        InputStream inputStreamOpenInputStream;
        int iA;
        Uri uri = this.d;
        YY1 yy1 = this.e;
        Cursor cursor = null;
        inputStreamOpenInputStream = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                cursorA = yy1.a.a(uri);
                if (cursorA != null) {
                    try {
                        try {
                            if (cursorA.moveToFirst()) {
                                string = cursorA.getString(0);
                                cursorA.close();
                            }
                        } catch (SecurityException unused) {
                            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                Objects.toString(uri);
                            }
                            if (cursorA != null) {
                            }
                            string = null;
                            zIsEmpty = TextUtils.isEmpty(string);
                            contentResolver = yy1.c;
                            if (zIsEmpty) {
                                inputStreamOpenInputStream = null;
                            } else {
                                file = new File(string);
                                if (file.exists()) {
                                    inputStreamOpenInputStream = null;
                                } else {
                                    inputStreamOpenInputStream = null;
                                }
                            }
                            if (inputStreamOpenInputStream != null) {
                                try {
                                    inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                    iA = com.bumptech.glide.load.a.a(yy1.d, inputStreamOpenInputStream2, yy1.b);
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                } catch (IOException | NullPointerException unused3) {
                                    if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                        Objects.toString(uri);
                                    }
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (IOException unused4) {
                                        }
                                    }
                                    iA = -1;
                                }
                            } else {
                                iA = -1;
                            }
                            if (iA != -1) {
                                return new C5747oa0(inputStreamOpenInputStream, iA);
                            }
                            return inputStreamOpenInputStream;
                        }
                        zIsEmpty = TextUtils.isEmpty(string);
                        contentResolver = yy1.c;
                        if (zIsEmpty) {
                            inputStreamOpenInputStream = null;
                        } else {
                            file = new File(string);
                            if (file.exists() || 0 >= file.length()) {
                                inputStreamOpenInputStream = null;
                            } else {
                                Uri uriFromFile = Uri.fromFile(file);
                                try {
                                    inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                                } catch (NullPointerException e) {
                                    throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e));
                                }
                            }
                        }
                        if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                            iA = com.bumptech.glide.load.a.a(yy1.d, inputStreamOpenInputStream2, yy1.b);
                            if (inputStreamOpenInputStream2 != null) {
                                inputStreamOpenInputStream2.close();
                            }
                        } else {
                            iA = -1;
                        }
                        if (iA != -1) {
                            return new C5747oa0(inputStreamOpenInputStream, iA);
                        }
                        return inputStreamOpenInputStream;
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorA;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (cursorA != null) {
                    cursorA.close();
                }
            } catch (SecurityException unused5) {
                cursorA = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                iA = com.bumptech.glide.load.a.a(yy1.d, inputStreamOpenInputStream2, yy1.b);
                if (inputStreamOpenInputStream2 != null) {
                    inputStreamOpenInputStream2.close();
                }
            } else {
                iA = -1;
            }
            if (iA != -1) {
                return new C5747oa0(inputStreamOpenInputStream, iA);
            }
            return inputStreamOpenInputStream;
        } catch (Throwable th3) {
            if (inputStreamOpenInputStream2 != null) {
                try {
                    inputStreamOpenInputStream2.close();
                } catch (IOException unused6) {
                }
            }
            throw th3;
        }
        string = null;
        zIsEmpty = TextUtils.isEmpty(string);
        contentResolver = yy1.c;
        if (zIsEmpty) {
            inputStreamOpenInputStream = null;
        } else {
            file = new File(string);
            if (file.exists()) {
                inputStreamOpenInputStream = null;
            } else {
                inputStreamOpenInputStream = null;
            }
        }
    }

    @Override // defpackage.InterfaceC6771tS
    public final void cancel() {
    }
}
