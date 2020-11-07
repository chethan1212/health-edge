package com.health.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SumVerifierTest {
	
	
    @Test
    public void testVerifySumExistInSinglePassForSuccess()
    {
    	int arr[] = {1,5,4,12,3,22,34};
        assertTrue( SumVerifier.verifySumExistInSinglePass(arr, 17));
    }

    @Test
    public void testVerifySumExistInSinglePassForSuccessWithNegativeValues()
    {
    	int arr[] = {1,5,-37,12,3,20,34};
        assertTrue( SumVerifier.verifySumExistInSinglePass(arr, 17));
    }
    
    @Test
    public void testVerifySumExistInSinglePassForFailure()
    {
    	int arr[] = {1,5,0,13,3,22,34};
        assertTrue( !SumVerifier.verifySumExistInSinglePass(arr, 17));
    }
    
    @Test
    public void testVerifySumExistInSinglePassForNullArray()
    {
    	int arr[] = null;
        assertTrue( !SumVerifier.verifySumExistInSinglePass(null, 17));
    }
    
    @Test
    public void testVerifySumExistInSinglePassForEmptyArray()
    {
    	int arr[] = {};
        assertTrue( !SumVerifier.verifySumExistInSinglePass(arr, 17));
    }
    
    @Test
    public void testVerifySumExistInSinglePassForSingleElementArray()
    {
    	int arr[] = {17};
        assertTrue( !SumVerifier.verifySumExistInSinglePass(arr, 17));
    }
    
    @Test
    public void testVerifySumExistInSinglePassForTwoElementArray()
    {
    	int arr[] = {10,7};
        assertTrue(SumVerifier.verifySumExistInSinglePass(arr, 17));
    }
    
    @Test
    public void testVerifySumExistInTwoPassForSuccess()
    {
    	int arr[] = {1,5,4,12,3,22,34};
        assertTrue( SumVerifier.verifySumExistInTwoPass(arr, 17));
    }

    @Test
    public void testVerifySumExistInTwoPassForSuccessWithNegativeValues()
    {
    	int arr[] = {1,5,-37,12,3,20,34};
        assertTrue( SumVerifier.verifySumExistInTwoPass(arr, 17));
    }
    
    @Test
    public void testVerifySumExistInTwoPassForFailure()
    {
    	int arr[] = {1,5,0,13,3,22,34};
        assertTrue( !SumVerifier.verifySumExistInTwoPass(arr, 17));
    }
    
}
