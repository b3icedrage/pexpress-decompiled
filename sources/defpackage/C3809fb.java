package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.core.content.FileProvider;
import io.sentry.android.core.b0;
import io.sentry.instrumentation.file.j;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3809fb implements InterfaceC6061q30 {

    @NotNull
    public final Context a;

    public C3809fb(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    public static void d(File file) {
        long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                ArrayList<File> arrayList = new ArrayList();
                for (File file2 : fileArrListFiles) {
                    if (file2.lastModified() < jCurrentTimeMillis) {
                        arrayList.add(file2);
                    }
                }
                for (File file3 : arrayList) {
                    Intrinsics.checkNotNull(file3);
                    C6179qd0.d(file3);
                }
                Unit unit = Unit.a;
            }
            C1717Ot1.a aVar2 = C1717Ot1.e;
        } catch (Throwable th) {
            C1717Ot1.a aVar3 = C1717Ot1.e;
            C1795Pt1.a(th);
        }
    }

    @Override // defpackage.InterfaceC6061q30
    @Nullable
    public final String a(@NotNull C5851p30 file, @NotNull EnumC5490nK1 directory) {
        Pair pair;
        Uri uriInsert;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(directory, "directory");
        if (Build.VERSION.SDK_INT >= 29) {
            int iOrdinal = directory.ordinal();
            if (iOrdinal == 0) {
                pair = new Pair(MediaStore.Images.Media.getContentUri("external_primary"), Environment.DIRECTORY_PICTURES);
            } else {
                if (iOrdinal != 1) {
                    throw new C6489s51();
                }
                pair = new Pair(MediaStore.Downloads.EXTERNAL_CONTENT_URI, Environment.DIRECTORY_DOWNLOADS);
            }
            Uri uri = (Uri) pair.d;
            String str = (String) pair.e;
            ContentResolver contentResolver = this.a.getContentResolver();
            ContentValues contentValues = new ContentValues();
            String str2 = file.a;
            contentValues.put("_display_name", str2);
            contentValues.put("mime_type", file.b);
            contentValues.put("relative_path", str);
            contentValues.put("is_pending", (Integer) 1);
            try {
                uriInsert = contentResolver.insert(uri, contentValues);
                if (uriInsert != null) {
                    try {
                        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                        if (outputStreamOpenOutputStream == null) {
                            throw new IllegalStateException("no output stream");
                        }
                        try {
                            outputStreamOpenOutputStream.write(file.c);
                            Unit unit = Unit.a;
                            outputStreamOpenOutputStream.close();
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("is_pending", (Integer) 0);
                            if (contentResolver.update(uriInsert, contentValues2, null, null) != 1) {
                                throw new IllegalStateException("not published");
                            }
                            String strC = c(uriInsert);
                            if (strC != null) {
                                str2 = strC;
                            }
                            return str + "/" + str2;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                C6621sj.b(outputStreamOpenOutputStream, th);
                                throw th2;
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        b0.e("WebViewDownloads", "MediaStore save failed: ".concat(e.getClass().getSimpleName()));
                        if (uriInsert != null) {
                            try {
                                C1717Ot1.a aVar = C1717Ot1.e;
                                contentResolver.delete(uriInsert, null, null);
                            } catch (Throwable th3) {
                                C1717Ot1.a aVar2 = C1717Ot1.e;
                                C1795Pt1.a(th3);
                            }
                        }
                        return null;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                uriInsert = null;
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC6061q30
    @Nullable
    public final Uri b(@NotNull C5851p30 file) {
        Context context = this.a;
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            File file2 = new File(context.getCacheDir(), "shared");
            d(file2);
            File file3 = new File(file2, UUID.randomUUID().toString());
            file3.mkdirs();
            File file4 = new File(file3, file.a);
            byte[] array = file.c;
            Intrinsics.checkNotNullParameter(file4, "<this>");
            Intrinsics.checkNotNullParameter(array, "array");
            FileOutputStream fileOutputStreamB = j.a.b(new FileOutputStream(file4), file4);
            try {
                fileOutputStreamB.write(array);
                Unit unit = Unit.a;
                fileOutputStreamB.close();
                return FileProvider.c(context, "com.pexpress.tool.fileprovider").b(file4);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C6621sj.b(fileOutputStreamB, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            b0.e("WebViewDownloads", "share copy failed: ".concat(e.getClass().getSimpleName()));
            return null;
        }
    }

    public final String c(Uri uri) {
        Object objA;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            Cursor cursorQuery = this.a.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    objA = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C6621sj.b(cursorQuery, th);
                        throw th2;
                    }
                }
            } else {
                objA = null;
            }
        } catch (Throwable th3) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th3);
        }
        return (String) (objA instanceof C1717Ot1.b ? null : objA);
    }
}
