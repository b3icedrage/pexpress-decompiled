package defpackage;

import com.google.auto.value.AutoValue;
import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class U80 {
    public static final C7270vo a = new C7270vo(10485760, HttpPlatformResponse.MAX_MESSAGE_LENGTH, 10000, 604800000, 81920);

    public abstract int a();

    public abstract long b();

    public abstract int c();

    public abstract int d();

    public abstract long e();
}
