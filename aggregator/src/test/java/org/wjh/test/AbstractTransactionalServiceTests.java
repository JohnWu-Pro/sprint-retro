package org.wjh.test;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

@ContextConfiguration(locations = {// @formatter:off
        "classpath*:META-INF/spring/service-config.xml"
        })// @formatter:on
public abstract class AbstractTransactionalServiceTests extends AbstractTransactionalJUnit4SpringContextTests {

}
