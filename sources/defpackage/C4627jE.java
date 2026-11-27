package defpackage;

import android.database.Cursor;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: jE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4627jE {
    public static void close(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
