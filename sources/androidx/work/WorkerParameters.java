package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.annotation.NonNull;
import defpackage.C3219ck2;
import defpackage.C4946kk2;
import defpackage.C7679xk2;
import defpackage.Xk2;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {

    @NonNull
    public UUID a;

    @NonNull
    public b b;

    @NonNull
    public HashSet c;

    @NonNull
    public a d;
    public int e;

    @NonNull
    public ExecutorService f;

    @NonNull
    public C4946kk2 g;

    @NonNull
    public Xk2 h;

    @NonNull
    public C7679xk2 i;

    @NonNull
    public C3219ck2 j;

    public static class a {

        @NonNull
        public List<String> a;

        @NonNull
        public List<Uri> b;
        public Network c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.a = list;
            this.b = list;
        }
    }

    public WorkerParameters() {
        throw null;
    }
}
