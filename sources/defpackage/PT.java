package defpackage;

import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LPT;", "", "<init>", "()V", "Ljava/text/SimpleDateFormat;", "iso8601Format", "()Ljava/text/SimpleDateFormat;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PT {

    @NotNull
    public static final PT INSTANCE = new PT();

    private PT() {
    }

    @NotNull
    public final SimpleDateFormat iso8601Format() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
    }
}
